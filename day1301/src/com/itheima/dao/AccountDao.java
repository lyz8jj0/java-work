package com.itheima.dao;

import com.itheima.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {

    /**
     * 转出钱
     *
     * @param fromUser
     * @param money
     */
    public void accountOut(Connection conn, String fromUser, String money) throws SQLException {
        PreparedStatement st = null;
        try {
            //编写sql
            String sql = "update account set money = money - ? where name = ?";

            //创建语句执行者
            st = conn.prepareStatement(sql);

            //设置参数
            st.setString(1, money);
            st.setString(2, fromUser);

            //执行sql
            int i = st.executeUpdate();

            //处理
            System.out.println("出：" + i);

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            JdbcUtils.closeStatement(st);
        }

    }

    /**
     * 转入钱
     *
     * @param toUser
     * @param money
     * @throws SQLException
     */
    public void accountIn(Connection conn, String toUser, String money) throws SQLException {
        PreparedStatement st = null;

        try {
//            conn = JdbcUtils.getConnection();
            //编写sql
            String sql = "update account set money = money + ? where name = ?";

            //创建语句执行者
            st = conn.prepareStatement(sql);

            //设置参数
            st.setString(1, money);
            st.setString(2, toUser);

            //执行sql
            int i = st.executeUpdate();

            //处理
            System.out.println("入：" + i);

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            JdbcUtils.closeStatement(st);
        }

    }
}
