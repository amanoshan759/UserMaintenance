package usermaintenance.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import usermaintenance.beans.UserBean;
import usermaintenance.db.DBConnection;

public class LoginServices {

    public UserBean authenticateUser(String un, String pwd) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UserBean objbean = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select * from usermaster where username=?");
            pstmt.setString(1, un);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                if (rs.getString("password").equals(pwd)) {
                    objbean = new UserBean();
                    objbean.setUserid(rs.getInt("userid"));
                    objbean.setEmail(rs.getString("email"));
                    objbean.setUserstatus(rs.getBoolean("userstatus"));
                    objbean.setUsertype(rs.getString("usertype"));
                    return objbean;
                }
            }
        } catch (Exception e) {
            System.out.println("authenticateuser " + e);
        } finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("authenticateuserfinally " + e);
            }
        }
        return objbean;
    }

    public static String[] forgotPassword(String user) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String a[] = new String[2];
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select password,email from usermaster where username=?");
            pstmt.setString(1, user);
            rs = pstmt.executeQuery();
            if (rs.next()) {

                a[0] = rs.getString("email");
                a[1] = rs.getString("password");
            }
             return a;
        } catch (Exception e) {
            System.out.println("authenticateuser " + e);
        } finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("authenticateuserfinally " + e);
            }
        }
        return null;
    }
}
