import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateTable {

    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/Education_Management";
            String userName = "root";
            String password = "duc11092004";

            Connection connection = DriverManager.getConnection(url, userName, password);

            String sql = "CREATE TABLE IF NOT EXISTS Person ("
                        + "PersonID VARCHAR(50) PRIMARY KEY,"
                        + "name VARCHAR(100) NOT NULL,"
                        + "dateOfBirth date,"
                        + "address VARCHAR(100),"
                        + "gender char(6)"
                        + ")";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Table 'Person' has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
