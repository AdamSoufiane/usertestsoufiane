package application.ports.out;

import domain.entities.User;

public interface UserRepositoryPort {
    void saveUser(User user);
}