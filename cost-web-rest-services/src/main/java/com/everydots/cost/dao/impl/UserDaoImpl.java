package com.everydots.cost.dao.impl;

import com.everydots.cost.dao.UserDao;
import com.everydots.cost.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User getUser(String username) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = (User) session.selectOne("com.everydots.cost.dao.UserDao.getUser", username);
            return user;
        } catch (Exception e) {

        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public String insertUser(User user) {
        SqlSession session = sqlSessionFactory.openSession();

        try {
            int insert = session.insert("com.everydots.cost.dao.UserDao.insertUser", user);
            return Integer.toString(insert);
        } catch (Exception e) {

        } finally {
            session.close();
        }
        return null;
    }
}
