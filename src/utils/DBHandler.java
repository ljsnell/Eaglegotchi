package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import critter.Eaglegotchi;
import critter.EaglegotchiExample;

public class DBHandler {
	
	public Eaglegotchi fetchEagleByUsername(String username) throws SQLException {		
	    	Connection con = DriverManager.getConnection(
	            "jdbc:sqlserver://localhost:1433;database=falljava2022", "user", "password");
	        PreparedStatement stmt = con.prepareStatement("SELECT * FROM [falljava2022].[dbo].[Eaglegotchi] where Username='" + username + "'");
	        ResultSet rslt = stmt.executeQuery();
	        Eaglegotchi gotchi = new Eaglegotchi();
	        while (rslt.next()) {
	         gotchi = new Eaglegotchi(rslt.getString("Eaglegotchi"), rslt.getString("Mood"), rslt.getInt("HungerLevel"), rslt.getString("IconPath"));
	        }
			return gotchi;
	      }
	}
