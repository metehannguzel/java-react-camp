package kodlamaio.hrmsdemo.business.abstracts;

import kodlamaio.hrmsdemo.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
