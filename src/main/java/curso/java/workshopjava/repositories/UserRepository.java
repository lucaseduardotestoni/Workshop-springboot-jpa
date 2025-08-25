package curso.java.workshopjava.repositories;

import curso.java.workshopjava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
