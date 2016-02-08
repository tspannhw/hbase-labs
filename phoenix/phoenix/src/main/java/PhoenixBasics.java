import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PhoenixBasics {

    public static void main(String[] args) throws Exception {
        Statement stmt = null;
        ResultSet rset = null;
        System.out.println("************************* ! ************************* ");
        Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
        System.out.println("************************* ! ************************* ");
        Connection con = DriverManager.getConnection("jdbc:phoenix:localhost");
        System.out.println("************************* ! ************************* ");
        stmt = con.createStatement();
        System.out.println("************************* ! ************************* ");
        stmt.executeUpdate("create table test (mykey integer not null primary key, mycolumn varchar)");
        System.out.println("************************* ! ************************* ");
        stmt.executeUpdate("upsert into test values (1,'Hello')");
        stmt.executeUpdate("upsert into test values (2,'World!')");
        con.commit();

        PreparedStatement statement = con.prepareStatement("select * from test");
        rset = statement.executeQuery();
        while (rset.next()) {
            System.out.println(rset.getString("mycolumn"));
        }
        statement.close();
        con.close();
    }
}