package curso.java.workshopjava.services;

import curso.java.workshopjava.model.User;
import curso.java.workshopjava.repositories.UserRepository;
import curso.java.workshopjava.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
      Optional<User> user = userRepository.findById(id);
      return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    public User insert(User user) {
        return userRepository.save(user);
    }
    public User delete(Long id) {
        User user = findById(id);
        userRepository.delete(user);
        return user;
    }
    public User update(Long id, User user) {
        User entityUser = userRepository.getReferenceById(id);
        updateData(entityUser, user);
        return userRepository.save(entityUser);
    }

    private void updateData(User entityUser, User user) {
        entityUser.setName(user.getName());
        entityUser.setEmail(user.getEmail());
        entityUser.setPhone(user.getPhone());
    }

}
