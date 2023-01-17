package ru.tananaev.preproject_3_1_2.dao;





import ru.tananaev.preproject_3_1_2.entity.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   User getUser(int id);
   void updateUser(User user);
   void removeUser(int id);

}
