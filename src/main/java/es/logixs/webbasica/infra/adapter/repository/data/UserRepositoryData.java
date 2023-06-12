package es.logixs.webbasica.infra.adapter.repository.data;

import es.logixs.webbasica.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepositoryData extends JpaRepository<User, UUID> {
    List<User> findAllByOrderByName();

}
