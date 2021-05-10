package kodlamaio.hrmsdemo.business.abstracts;

import kodlamaio.hrmsdemo.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
