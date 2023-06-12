package es.logixs.webbasica.infra.adapter;

import es.logixs.webbasica.domain.model.User;
import es.logixs.webbasica.domain.port.output.UserOutputPort;
import es.logixs.webbasica.infra.adapter.repository.data.UserRepositoryData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAdapter implements UserOutputPort {
    private UserRepositoryData userRepository;

    public UserAdapter(UserRepositoryData userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void activateAvatar(User user) {
        user.setAvatar("miavatar");
        userRepository.save(user);
    }
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllUsersOrderByName() {
        return userRepository.findAllByOrderByName();
    }
}
