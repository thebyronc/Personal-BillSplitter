package dao;

import models.User;

public interface UserDao {
    void add(User user);
    User findById(int id);
}
