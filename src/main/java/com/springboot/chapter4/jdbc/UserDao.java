package com.springboot.chapter4.jdbc;

import com.springboot.chapter4.pojo.User;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class UserDao {
    public int insertUser(Connection conn, User user) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO t_user(id,user_name,note) VALUES (?,?,?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getNote());
            ps.setString(3, user.getUserName());
            return ps.executeUpdate();
        } finally {
            ps.close();
        }
    }
}
