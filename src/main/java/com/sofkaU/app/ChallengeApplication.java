package com.sofkaU.app;

import com.sofkaU.app.db.ConnectionDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);

		try (Connection cnx = ConnectionDB.getInstance();
			 Statement stmt = cnx.createStatement();
			 ResultSet result = stmt.executeQuery("SELECT * FROM player");) {

			while (result.next()){
				System.out.print("Player: ");
				System.out.print(result.getString("nombreJugador"));
				System.out.print(" Puntos: ");
				System.out.println(result.getInt("puntajeJugador"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}



}
