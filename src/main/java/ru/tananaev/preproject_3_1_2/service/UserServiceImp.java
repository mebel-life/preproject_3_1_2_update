package ru.tananaev.preproject_3_1_2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tananaev.preproject_3_1_2.dao.UserDao;
import ru.tananaev.preproject_3_1_2.entity.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional(readOnly = true)
   @Override
   public User getUser(int id) {
      return userDao.getUser(id);
   }
   @Transactional
   @Override
   public void updateUser(User user) {
      userDao.updateUser(user);
   }
   @Transactional
   @Override
   public void removeUser(int id) {
      userDao.removeUser(id);
   }

}
