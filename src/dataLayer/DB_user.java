package dataLayer;

import java.sql.*;

public class DB_user {
    static final String JDBC_DRIVER="com.sql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/webapptutorial";

    static final String USER="webappuser";
    static final String PASS="test123";
    public boolean isValidUserLogin(String sUsername,String sUserPassword){
       boolean isValidUser=false;
        Connection conn=null;
        Statement stmt=null;
        String sql="";


        try {
            System.out.println("Open connection");
             conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Create statement");
            stmt=conn.createStatement();

            sql="SELECT * FROM users WHERE user_name= \" " + sUsername + "\" AND user_password=\""+sUserPassword + "\" ";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                isValidUser=true;
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(stmt!=null)
                    stmt.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Closing DB Connection -GoodBye");
        return isValidUser;
    }

}
