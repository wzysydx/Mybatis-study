package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){

        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一：getMapper
//        UserDao userdao = sqlSession.getMapper(UserDao.class);
//        List<User> userList = userdao.getUserList();

        //方拾二：
        List<User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");


        for (User user : userList) {
            System.out.println(user);
        }



        //关闭sqlsession
        sqlSession.close();

    }

}


