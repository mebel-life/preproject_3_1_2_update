package ru.tananaev.preproject_3_1_2.service;





import ru.tananaev.preproject_3_1_2.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUser(int id);
    void updateUser(User user);
    void removeUser(User user);

}