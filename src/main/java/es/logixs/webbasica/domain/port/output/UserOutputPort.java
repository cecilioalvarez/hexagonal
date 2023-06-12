package es.logixs.webbasica.domain.port.output;

import es.logixs.webbasica.domain.model.User;

import java.util.List;

public interface UserOutputPort {

    public User save(User user);
    public void activateAvatar(User user);

    public List<User> findAllUsers();
    public List<User>  findAllUsersOrderByName();
}
