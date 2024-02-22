package infrastructure.adapters.inbound.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import application.ports.in.UserRegistrationUseCase;
import domain.entities.User;

@RestController
@RequestMapping("/users")
public class UserRegistrationController {

    private final UserRegistrationUseCase userRegistrationUseCase;

    @Autowired
    public UserRegistrationController(UserRegistrationUseCase userRegistrationUseCase) {
        this.userRegistrationUseCase = userRegistrationUseCase;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userRegistrationUseCase.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

}