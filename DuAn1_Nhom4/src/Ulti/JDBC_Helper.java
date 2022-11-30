/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ulti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hung duong
 */
public class JDBC_Helper {

    public static ResultSet selectTongQuat(String sql, Object... paramas) {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            con = DBContext.getConnection();
            pst = con.prepareStatement(sql);
            for (int i = 0; i < paramas.length; i++) {
                pst.setObject(i + 1, paramas[i]);
            }
            rs = pst.executeQuery();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
            close(pst, con, rs);
            return null;
        }
    }

    public static void close(PreparedStatement pst, Connection con) {
        try {
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement pst, Connection con, ResultSet rs) {
        try {
            close(pst, con);
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int updateTongQuat(String sql, Object... paramas) {
        Connection con = null;

        PreparedStatement pst = null;
        try {
            con = DBContext.getConnection();
            pst = con.prepareStatement(sql);
            for (int i = 0; i < paramas.length; i++) {
                pst.setObject(i + 1, paramas[i]);
            }

            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();

            return 0;
        } finally {
            close(pst, con);
        }
    }
}
