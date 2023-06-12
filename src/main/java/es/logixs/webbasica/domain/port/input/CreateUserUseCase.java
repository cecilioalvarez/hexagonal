package es.logixs.webbasica.domain.port.input;

import es.logixs.webbasica.domain.model.User;
import es.logixs.webbasica.domain.port.input.commands.CreateUserCommand;

public interface CreateUserUseCase {

    public User createUser(CreateUserCommand command);
    public void activateAvatarUser(User user);
}
