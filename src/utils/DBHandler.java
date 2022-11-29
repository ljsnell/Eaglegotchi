package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import critter.Eaglegotchi;
import critter.EaglegotchiExample;

public class DBHandler {

	private Connection createConnection() {
		try {
			return DriverManager.getConnection(
			        "jdbc:sqlserver://localhost:1433;database=falljava2022", "user", "password");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Eaglegotchi fetchEagleByUsername(String username) throws SQLException {		
	    	Connection con = createConnection();
	        PreparedStatement stmt = con.prepareStatement("SELECT * FROM [falljava2022].[dbo].[Eaglegotchi2] where Username='" + username + "'");
	        ResultSet rslt = stmt.executeQuery();
	        Eaglegotchi gotchi = new Eaglegotchi();
	        while (rslt.next()) {
	         gotchi = new Eaglegotchi(rslt.getString("Eaglegotchi"), rslt.getInt("Mood"), rslt.getInt("HungerLevel"), rslt.getString("IconPath"));
	        }
			return gotchi;
	      }

	public String updateEagle(Eaglegotchi eagle) throws SQLException {
		Connection con = createConnection();
		String updateQuery = "UPDATE [falljava2022].[dbo].[Eaglegotchi2] SET Mood = " + eagle.getMood() + ", HungerLevel = " + eagle.getHungerLevel() + " where Username='LSNELL'";
		System.out.println(updateQuery);
		PreparedStatement stmt = con.prepareStatement(updateQuery);
	    int rslt = stmt.executeUpdate();

		return "Success";
	}
}
