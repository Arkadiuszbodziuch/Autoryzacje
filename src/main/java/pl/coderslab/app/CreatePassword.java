package pl.coderslab.app;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreatePassword {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Platform?serverTimezone=UTC",
                "root", "zaq12wsx")) {
            String sql = "update tweeter_user set password=?";
            String password = BCrypt.hashpw("123456", BCrypt.gensalt());
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, password);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
