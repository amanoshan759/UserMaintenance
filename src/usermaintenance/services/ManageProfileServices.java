package usermaintenance.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import usermaintenance.beans.UserBean;
import usermaintenance.db.DBConnection;

public class ManageProfileServices {

    public static UserBean getByUserid(int userid) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select * from usermaster where userid=?");
            pstmt.setInt(1, userid);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                UserBean objbean = new UserBean();
                objbean.setUserid(rs.getInt("userid"));
                objbean.setUsername(rs.getString("username"));
                objbean.setPassword(rs.getString("password"));
                objbean.setName(rs.getString("name"));
                objbean.setDob(rs.getString("dob"));
                objbean.setEmail(rs.getString("email"));
                objbean.setAddress(rs.getString("address"));
                objbean.setContact(rs.getString("contact"));
                objbean.setGender(rs.getBoolean("gender"));
                return objbean;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }

    public static boolean updateUser(UserBean objbean) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("update usermaster set password=?,name=?,dob=?,email=?,address=?,contact=?,gender=? where userid=? && username=?");
            pstmt.setString(1, objbean.getPassword());
            pstmt.setString(2, objbean.getName());
            pstmt.setString(3, objbean.getDob());
            pstmt.setString(4, objbean.getEmail());
            pstmt.setString(5, objbean.getAddress());
            pstmt.setString(6, objbean.getContact());
            pstmt.setBoolean(7, objbean.isGender());
            pstmt.setInt(8, objbean.getUserid());
            pstmt.setString(9, objbean.getUsername());
            int a = pstmt.executeUpdate();
            if (a > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return false;
    }

    public static boolean checkEmail(String s) {
        System.out.println(s);
        int a = s.indexOf("@");
        int b = s.lastIndexOf("@");
        if (!(s.endsWith(".com"))) {
            return false;
        } else if (s.startsWith("@") || s.endsWith("@") || s.endsWith("@.com") || s.startsWith(".")) {
            return false;
        } else if (s.startsWith("0") || s.startsWith("1") || s.startsWith("2") || s.startsWith("3") || s.startsWith("4") || s.startsWith("5") || s.startsWith("6") || s.startsWith("7") || s.startsWith("8") || s.startsWith("9")) {
            return false;
        } else if (s.contains(".@") || (!s.contains("@")) || (a != b) || (s.contains("!")) || (s.contains("#")) || (s.contains("$")) || (s.contains("%")) || (s.contains("^") || (s.contains("&"))) || (s.contains("*")) || (s.contains("-")) || (s.contains("+")) || (s.contains(">")) || (s.contains("<")) || (s.contains("?")) || (s.contains("/")) || (s.contains(":")) || (s.contains(";"))) {
            return false;
        }
        return true;
    }
}
