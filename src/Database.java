package urbanbarnacle.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

    private String URL = "jdbc:mysql://localhost:3306/student_db";
    private String USER = "chief";
    private String PASS = "John-117";
    private char[] pas = {'J','o','h','n','-','1','1','7'};

    public Database() {

    }

    public boolean validate(String username, String password) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, new String(pas));
            PreparedStatement ps = con.prepareStatement("SELECT password from users WHERE username=?;");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() && password.equals(rs.getString(1))) {
                return true;
            }
            return false;
    
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            System.exit(0);
            return false;
        }
    }
}