package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//mycket pill i wsl för att få de o funka
// ändra i port till 3307 annars krokar de med windows sql som körs på 3306
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3307/bibliotek";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Anslutning lyckades! " + conn.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            System.err.println("Anslutning misslyckades: " + e.getMessage());
        }
    }
}