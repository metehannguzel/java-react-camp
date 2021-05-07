package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
    private UserCheckService checkService;
    private UserDao userDao;

    public UserManager(UserCheckService checkService, UserDao userDao) {
        this.checkService = checkService;
        this.userDao = userDao;
    }

    @Override
    public void signUp(User user) {
        if(checkService.isValidUser(user, userDao)) {
            userDao.add(user);
            System.out.println("Registration successful!");
            return;
        }
        System.out.println("Registration failed!");
    }

    @Override
    public void signIn(String email, String password) {

        if(checkService.isValidLoginInfo(email, password, userDao)) {
            System.out.println("Log in successful!");
            return;
        }
        System.out.println("Log in failed!");
    }

    @Override
    public void update(User user) {
        if(checkService.isValidUser(user, userDao)) {
            userDao.update(user);
            System.out.println("Update successful!");
            return;
        }
        System.out.println("Update failed!");
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
        System.out.println("Delete successful!");
    }
}
