package kodlamaio.hrmsdemo.business.abstracts;

import kodlamaio.hrmsdemo.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
}
