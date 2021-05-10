package kodlamaio.hrmsdemo;

import kodlamaio.hrmsdemo.api.controllers.EmployeesController;
import kodlamaio.hrmsdemo.business.abstracts.EmployeeService;
import kodlamaio.hrmsdemo.business.concretes.EmployeeManager;
import kodlamaio.hrmsdemo.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrmsdemo.entities.concretes.Employee;
import kodlamaio.hrmsdemo.entities.concretes.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrmsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsDemoApplication.class, args);

    }

}
