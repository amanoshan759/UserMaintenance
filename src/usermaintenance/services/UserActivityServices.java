package usermaintenance.services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.SpringLayout;
import usermaintenance.db.DBConnection;

public class UserActivityServices {

    public static String getCurrentDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = new Date();
        String s = sdf.format(d);
        return s;
    }

    public static int addLoginTime(int userid) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        System.out.println("asdf");
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("insert into activitymaster(userid,logintime) value(?,?)");
            pstmt.setInt(1, userid);
            pstmt.setString(2, getCurrentDateTime());
            int a = pstmt.executeUpdate();
            if (a > 0) {
                pstmt = conn.prepareStatement("select max(activityid) as activityid from activitymaster");
                rs = pstmt.executeQuery();
            }
             while (rs.next()) {
                 return (rs.getInt("activityid"));
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
        return 0;
    }
    
    public static boolean updategetTime(int activityid)
    {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("update activitymaster set logouttime=? where activityid=?");
            pstmt.setString(1, getCurrentDateTime());
            pstmt.setInt(2, activityid);
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
}
