package es.logixs.webbasica.application.controller;

import es.logixs.webbasica.domain.port.input.commands.CreateUserCommand;
import es.logixs.webbasica.domain.service.UserCompanyService;
import org.springframework.web.bind.annotation.*;
import es.logixs.webbasica.dto.UserDTO;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserCompanyService userCompanyService;

    public UserController(UserCompanyService userCompanyService) {
        this.userCompanyService = userCompanyService;
    }

    @GetMapping
    public List<UserDTO> findAllUsers() {

        // es un metodo de referencia que se encarga de referenciar a un constructor;
        return userCompanyService.findAllUsers().stream().map(UserDTO::new).collect(Collectors.toList());

    }


    @PostMapping
    public  UserDTO  saveUser(@RequestBody CreateUserCommand command) {
        return new UserDTO(userCompanyService.createUser(command));
    }


}
