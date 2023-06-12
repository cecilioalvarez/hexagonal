package es.logixs.webbasica.domain.port.input;

import es.logixs.webbasica.domain.model.Company;

public interface CreateCompanyUseCase {

    public void createCompany(Company company);
}
