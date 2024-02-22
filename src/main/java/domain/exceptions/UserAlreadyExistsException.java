package domain.exceptions;

public class UserAlreadyExistsException extends RuntimeException {

    private final String email;

    public UserAlreadyExistsException(String email) {
        super("A user with the email '" + email + "' already exists.");
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}