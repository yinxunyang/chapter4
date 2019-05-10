package com.springboot.chapter4.jdbc;

import com.springboot.chapter4.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
@Service
public class UserService {
    public int insertUser() {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("user_name_1");
        user.setNote("note_1");
        Connection conn = null;
        int result = 0;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","springboot","springboot");
            conn.setAutoCommit(false);
            result = userDao.insertUser(conn, user);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return result;
    }
}
