package business.abstracts;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public interface UserCheckService {
    boolean isValidFirstName(String firstName);
    boolean isValidLastName(String lastName);
    boolean isValidEmail(String email);
    boolean isUsedEmail(String email, UserDao userDao);
    boolean isValidPassword(String password);
    boolean isValidUser(User user, UserDao userDao);
    boolean isValidLoginInfo(String email, String password, UserDao userDao);
}
