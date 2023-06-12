package es.logixs.webbasica.infra.adapter.repository.data;

import es.logixs.webbasica.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepositoryData extends JpaRepository<Company, UUID> {
}
