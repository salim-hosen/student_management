
package StudentInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBconnect {
    private static Connection connection;
    
    public static Connection mySqlCon(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/student_management", "root","");
            if(connection == null){
                JOptionPane.showMessageDialog(null, "Error Connection!");
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
