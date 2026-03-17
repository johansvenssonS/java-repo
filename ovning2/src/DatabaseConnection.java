package src;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; //Bygger statements, queeries ?
import java.sql.ResultSet; // Hanterar svar res?

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
            //Success koppling till db
            System.out.println("Anslutning lyckades! " + conn.getMetaData().getDatabaseProductName());
            //Initialisera ett statement av connection objektet.
            Statement stmt = conn.createStatement();
            //Bygga upp sql queery i en str"
            String query = "SELECT id, title, isbn, year_published FROM books LIMIT 20";
            // Skapa en resultset av de vi får i respons av statement(sqlqueery)
            ResultSet res = stmt.executeQuery(query);

            //I detta fall Limit 20 så 20 loopar.
            //Medans res har fler i "kön" framför? så bygger vi logs av Resultsettet.
            while (res.next()) {
                int id = res.getInt("id");
                String title = res.getString("title");
                String isbn = res.getString("isbn");
                int year = res.getInt("year_published");
                System.out.println("Bok-id:"+ id +" | Bok-titel:" + title + " | Bok-isbn:"+ isbn + "| Utgivningår:"+ year );
            }
        } catch (SQLException e) {
            System.err.println("Anslutning misslyckades: " + e.getMessage());
        }
    }
}