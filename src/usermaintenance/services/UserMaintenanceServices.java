//addUser,updateUser,list
package usermaintenance.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import usermaintenance.beans.UserBean;
import usermaintenance.db.DBConnection;

public class UserMaintenanceServices {

    public static boolean addUser(UserBean objbean) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("insert into usermaster (userid,username,password,usertype,userstatus,name,dob,email,address,contact,gender) value(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1, objbean.getUserid());
            pstmt.setString(2, objbean.getUsername());
            pstmt.setString(3, objbean.getPassword());
            pstmt.setString(4, objbean.getUsertype());
            pstmt.setBoolean(5, objbean.isUserstatus());
            pstmt.setString(6, objbean.getName());
            pstmt.setString(7, objbean.getDob());
            pstmt.setString(8, objbean.getEmail());
            pstmt.setString(9, objbean.getAddress());
            pstmt.setString(10, objbean.getContact());
            pstmt.setBoolean(11, objbean.isGender());
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

    public static ArrayList getAllUser() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<UserBean> al = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select * from usermaster");
            al = new ArrayList<UserBean>();
            rs = pstmt.executeQuery();
            while (rs.next()) {
                UserBean objbean = new UserBean();
                objbean.setUserid(rs.getInt("userid"));
                objbean.setUsername(rs.getString("username"));
                objbean.setPassword(rs.getString("password"));
                objbean.setUsertype(rs.getString("usertype"));
                objbean.setUserstatus(rs.getBoolean("userstatus"));
                objbean.setName(rs.getString("name"));
                objbean.setDob(rs.getString("dob"));
                objbean.setEmail(rs.getString("email"));
                objbean.setAddress(rs.getString("address"));
                objbean.setContact(rs.getString("contact"));
                objbean.setGender(rs.getBoolean("gender"));
                al.add(objbean);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                //pstmt.close();
                //conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return al;
    }

    public static boolean updateUser(UserBean objbean) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("update usermaster set username=?,password=?,name=?,dob=?,email=?,address=?,contact=?,gender=? where userid=?");
            pstmt.setString(1, objbean.getUsername());
            pstmt.setString(2, objbean.getPassword());
            pstmt.setString(3, objbean.getName());
            pstmt.setString(4, objbean.getDob());
            pstmt.setString(5, objbean.getEmail());
            pstmt.setString(6, objbean.getAddress());
            pstmt.setString(7, objbean.getContact());
            pstmt.setBoolean(8, objbean.isGender());
            pstmt.setInt(9, objbean.getUserid());
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

    static public int getMaxUserid() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select max(userid) as userid from usermaster");
            rs = pstmt.executeQuery();
            if (rs.next()) {
                return (rs.getInt("userid") + 1);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                //rs.close();
                //pstmt.close();
                //conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return 0;
    }
    
    public static ArrayList list(String s) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<UserBean> al = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select * from usermaster where usertype=?");
            pstmt.setString(1, s);
            al = new ArrayList<UserBean>();
            rs = pstmt.executeQuery();
            while (rs.next()) {
                UserBean objbean = new UserBean();
                objbean.setUserid(rs.getInt("userid"));
                objbean.setUsername(rs.getString("username"));
                objbean.setPassword(rs.getString("password"));
                objbean.setUsertype(rs.getString("usertype"));
                objbean.setUserstatus(rs.getBoolean("userstatus"));
                objbean.setName(rs.getString("name"));
                objbean.setDob(rs.getString("dob"));
                objbean.setEmail(rs.getString("email"));
                objbean.setAddress(rs.getString("address"));
                objbean.setContact(rs.getString("contact"));
                objbean.setGender(rs.getBoolean("gender"));
                al.add(objbean);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                //pstmt.close();
                //conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return al;
    }
    
    public static ArrayList search(String s) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<UserBean> al = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select * from usermaster where name=?");
            pstmt.setString(1, s);
            al = new ArrayList<UserBean>();
            rs = pstmt.executeQuery();
            while (rs.next()) {
                UserBean objbean = new UserBean();
                objbean.setUserid(rs.getInt("userid"));
                objbean.setUsername(rs.getString("username"));
                objbean.setPassword(rs.getString("password"));
                objbean.setUsertype(rs.getString("usertype"));
                objbean.setUserstatus(rs.getBoolean("userstatus"));
                objbean.setName(rs.getString("name"));
                objbean.setDob(rs.getString("dob"));
                objbean.setEmail(rs.getString("email"));
                objbean.setAddress(rs.getString("address"));
                objbean.setContact(rs.getString("contact"));
                objbean.setGender(rs.getBoolean("gender"));
                al.add(objbean); 
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                //pstmt.close();
                //conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return al;
    }
    
    public static ArrayList getUser() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<UserBean> al = null;
        try {
            conn = DBConnection.connect();
            pstmt = conn.prepareStatement("select * from activitymaster");
            al = new ArrayList<UserBean>();
            rs = pstmt.executeQuery();
            while (rs.next()) {
                UserBean objbean = new UserBean();
                objbean.setActivityid(rs.getInt("activityid"));
                objbean.setUserid(rs.getInt("userid"));
                objbean.setLogintime(rs.getString("logintime"));
                objbean.setLogouttime(rs.getString("logouttime"));
                al.add(objbean);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                //pstmt.close();
                //conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return al;
    }

}

