package es.logixs.webbasica.domain.port.output;

import es.logixs.webbasica.domain.model.Company;

public interface SaveCompanyOutputPort {

    public Company save(Company company);
}
