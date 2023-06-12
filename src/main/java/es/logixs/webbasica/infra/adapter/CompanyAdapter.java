package es.logixs.webbasica.infra.adapter;

import es.logixs.webbasica.domain.model.Company;
import es.logixs.webbasica.domain.port.output.SaveCompanyOutputPort;
import org.springframework.stereotype.Component;

@Component
public class CompanyAdapter implements SaveCompanyOutputPort {
    @Override
    public Company save(Company company) {
        return null;
    }
}
