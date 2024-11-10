package bahniuk.pr32.repository;

import org.springframework.stereotype.Component;

import bahniuk.pr32.model.User;

@Component
public class UserRepository {

    public User getDefaultUser() {
        return new User("Oleksandr", "Bahniuk");
    }
}