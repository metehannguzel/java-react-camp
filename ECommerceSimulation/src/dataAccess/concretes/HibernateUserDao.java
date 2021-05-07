package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> usersInDatabase = new ArrayList<>();

    @Override
    public void add(User user) {
        System.out.println("Saved to database by Hibernate : " + user.getFirstName() + " " + user.getLastName() + "\n" + user.getEmail());
        usersInDatabase.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println("Updated by Hibernate : " + user.getFirstName() + " " + user.getLastName() + "\n" + user.getEmail());
        usersInDatabase.remove(getById(user.getId()));
        usersInDatabase.add(user);
    }

    @Override
    public void delete(User user) {
        System.out.println("Deleted by Hibernate : " + user.getFirstName() + " " + user.getLastName() + "\n" + user.getEmail());
        usersInDatabase.remove(user);
    }

    @Override
    public User getById(int id) {
        List<User> users = this.getAll();
        if(users != null) {
            for(User user : users) {
                if(user.getId() == id)
                    return user;
            }
        }
        return null;
    }

    @Override
    public User getByEmail(String email) {
        List<User> users = this.getAll();
        if(users != null) {
            for(User user : users) {
                if(user.getEmail().equals(email));
                    return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return usersInDatabase;
    }
}
