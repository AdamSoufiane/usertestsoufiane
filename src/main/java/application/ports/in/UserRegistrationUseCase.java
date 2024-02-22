package application.ports.in;

import domain.entities.User;

public interface UserRegistrationUseCase {
    User registerUser(User user);
}