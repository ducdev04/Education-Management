package universitiymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WINDOWS 10
 */
public class Database {

    public static Connection connectDB() {

        try {
            // Sử dụng driver mới
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Kết nối tới cơ sở dữ liệu
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false&serverTimezone=UTC", "root", "duc11092004");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
