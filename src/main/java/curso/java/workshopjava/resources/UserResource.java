package curso.java.workshopjava.resources;

import curso.java.workshopjava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u =  new User(1L,"maria","maria@teste.com", "00000-000", "12345");
        return ResponseEntity.ok().body(u);
    }
}
