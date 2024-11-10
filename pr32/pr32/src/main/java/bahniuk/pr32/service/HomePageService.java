package bahniuk.pr32.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import bahniuk.pr32.model.User;
import bahniuk.pr32.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HomePageService {

    public static final String GREETINGS_FORMAT = "Welcome to the club buddy %s %s,\nhave a little fun.\nTime of last refresh:%s";
    private UserRepository userRepository;

    public String getHelloString() {
        User user = userRepository.getDefaultUser();
        return String.format(GREETINGS_FORMAT, user.getName(), user.getSurname(), LocalDateTime.now());
    }
}