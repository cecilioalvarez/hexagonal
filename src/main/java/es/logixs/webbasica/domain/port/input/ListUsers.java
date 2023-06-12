package es.logixs.webbasica.domain.port.input;

import es.logixs.webbasica.domain.model.User;

import java.util.List;

public interface ListUsers {

    public List<User> findAllUsers();
    public List<User> findAllOrderName();
}
