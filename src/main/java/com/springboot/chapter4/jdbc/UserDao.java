package com.springboot.chapter4.jdbc;

import com.springboot.chapter4.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

@Component
public class UserDao {
    public int insertUser(Connection conn, User user) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO t_user(id,user_name,note) VALUES (?,?,?)");
            ps.setString(1, UUID.randomUUID().toString().replace("-",""));
            ps.setString(2, user.getNote());
            ps.setString(3, user.getUserName());
            return ps.executeUpdate();
        } finally {
            ps.close();
        }
    }
}
