package business.concretes;

import business.abstracts.UserCheckService;
import core.abstracts.AuthService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {
    private AuthService authService;
    private EmailService emailService;

    public UserCheckManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public UserCheckManager(AuthService authService, EmailService emailService) {
        this.authService = authService;
        this.emailService = emailService;
    }

    @Override
    public boolean isValidFirstName(String firstName) {
        if(firstName.length() >= 2)
            return true;
        System.out.println("Your first name can't be less than 2 characters!");
        return false;
    }

    @Override
    public boolean isValidLastName(String lastName) {
        if(lastName.length() >= 2)
            return true;
        System.out.println("Your last name can't be less than 2 characters!");
        return false;
    }

    @Override
    public boolean isValidEmail(String email) {
        String emailRegex = "^[A-Z0-9._]+@[A-Z0-9.]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        if (email == null){
            System.out.println("Wrong email format!");
            return false;
        }else if(!pattern.matcher(email).matches()){
            System.out.println("Wrong email format");
        }
        return true;
    }

    @Override
    public boolean isUsedEmail(String email, UserDao userDao) {
        if(userDao.getByEmail(email) != null) {
            System.out.println("Email address is already taken!");
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidPassword(String password) {
        if(password.length() >= 6)
            return true;
        System.out.println("Your password can't be less than 6 characters!");
        return false;
    }

    @Override
    public boolean isValidUser(User user, UserDao userDao) {
        if(authService != null)
            return authService.isValidUser();
        if(!isValidFirstName(user.getFirstName()))
            return false;
        if(!isValidLastName(user.getLastName()))
            return false;
        if(!isValidEmail(user.getEmail()))
            return false;
        if(!isValidPassword(user.getPassword()))
            return false;
        if(isUsedEmail(user.getEmail(), userDao))
            return false;
        emailService.sendVerificationEmail(user.getEmail());
        return true;
    }

    @Override
    public boolean isValidLoginInfo(String email, String password, UserDao userDao) {
        if(authService != null)
            return authService.isValidUser();
        User user = userDao.getByEmail(email);
        if(user == null) {
            System.out.println("Wrong email address!");
            return false;
        }else if(!user.getPassword().equals(password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return true;
    }
}
