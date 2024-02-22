package infrastructure.adapters.out.db;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import domain.entities.User;
import application.ports.out.UserRepositoryPort;

public class PostgresUserRepositoryAdapter implements UserRepositoryPort {

    private final EntityManager entityManager;

    public PostgresUserRepositoryAdapter(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        entityManager.persist(user);
        return user;
    }
}