package curso.java.workshopjava.services;

import curso.java.workshopjava.model.User;
import curso.java.workshopjava.repositories.UserRepository;
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
      return user.get();
    }
    public User insert(User user) {
        return userRepository.save(user);
    }
    public User delete(Long id) {
        User user = findById(id);
        userRepository.delete(user);
        return user;
    }

}
