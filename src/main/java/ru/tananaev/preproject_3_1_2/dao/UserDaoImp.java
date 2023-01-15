package ru.tananaev.preproject_3_1_2.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.tananaev.preproject_3_1_2.entity.User;


import java.util.List;


@Component
public class UserDaoImp implements UserDao {
   @PersistenceContext
   EntityManager entityManager;

   @Override
   public void add(User user) {
      entityManager.persist(user);
   }

   @Override
   public List<User> listUsers() {
      List<User> user = entityManager.createQuery("from User").getResultList();
      return user;
   }
   @Override
   public User getUser(int id) {
      return entityManager.find(User.class, id);
   }

   @Override
   public void updateUser(User user) {
      entityManager.merge(user);
   }

   @Override
   public void removeUser(User user) {
      entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
   }
}

