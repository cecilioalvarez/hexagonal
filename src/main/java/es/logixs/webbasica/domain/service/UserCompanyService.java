package es.logixs.webbasica.domain.service;

import es.logixs.webbasica.domain.model.Company;
import es.logixs.webbasica.domain.model.User;
import es.logixs.webbasica.domain.port.input.CreateCompanyUseCase;
import es.logixs.webbasica.domain.port.input.CreateUserUseCase;
import es.logixs.webbasica.domain.port.input.ListUsers;
import es.logixs.webbasica.domain.port.input.commands.CreateUserCommand;
import es.logixs.webbasica.domain.port.output.SaveCompanyOutputPort;
import es.logixs.webbasica.domain.port.output.UserOutputPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCompanyService implements ListUsers,CreateUserUseCase, CreateCompanyUseCase  {

    private SaveCompanyOutputPort saveCompany;
    private UserOutputPort userPort;

    public UserCompanyService(SaveCompanyOutputPort saveCompany, UserOutputPort saveUser) {
        this.saveCompany = saveCompany;
        this.userPort = saveUser;

    }

    @Override
    public void activateAvatarUser(User user) {

        userPort.activateAvatar(user);

    }

    @Override
    public void createCompany(Company company) {

        saveCompany.save(company);
    }

    @Override
    public User createUser(CreateUserCommand command) {
        command.validate();
        return userPort.save(command.createUser());
    }

    @Override
    public List<User> findAllUsers() {
        return userPort.findAllUsers();
    }

    @Override
    public List<User> findAllOrderName() {
        return null;
    }
}
