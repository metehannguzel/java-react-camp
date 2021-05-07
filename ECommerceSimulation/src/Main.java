import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import core.concretes.EmailManager;
import core.concretes.GoogleAuthManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, " ", " ", " ", " ");
        User user2 = new User(2, " ", " ", " ", " ");
        User user3 = new User();

        System.out.println("-------------------------");

        UserManager userManager1 = new UserManager(new UserCheckManager(new EmailManager()), new HibernateUserDao());
        userManager1.signUp(user1);
        userManager1.signIn(user1.getEmail(), user1.getPassword());

        System.out.println("-------------------------");

        userManager1.signUp(user2);
        userManager1.signIn(user2.getEmail(), user2.getPassword());

        System.out.println("-------------------------");

        UserManager userManager2 = new UserManager(new UserCheckManager(new GoogleAuthManagerAdapter(), new EmailManager()), new HibernateUserDao());
        userManager2.signUp(user3);
        userManager2.signIn(user3.getEmail(), user3.getPassword());


    }
}