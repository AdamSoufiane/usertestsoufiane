package application.services;

import application.ports.out.UserRepositoryPort;
import domain.entities.User;
import domain.exceptions.UserAlreadyExistsException;

public class UserRegistrationService {

    private final UserRepositoryPort userRepositoryPort;

    public UserRegistrationService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    public User registerUser(User user) throws UserAlreadyExistsException {
        // Logic to check if the user already exists would go here
        // For example, userRepositoryPort.findByEmail(user.getEmail())
        // If user exists, throw new UserAlreadyExistsException(user.getEmail());

        // If user doesn't exist, save the user
        return userRepositoryPort.saveUser(user);
    }
}
