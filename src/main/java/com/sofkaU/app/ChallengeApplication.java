package com.sofkaU.app;

import com.sofkaU.app.db.ConnectionDB;
import com.sofkaU.app.model.*;
import com.sofkaU.app.repository.PlayerRepository;
import com.sofkaU.app.repository.PlayerRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.Scanner;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);



		try (Connection cnx = ConnectionDB.getInstance()){
			PlayerRepository<Player> repository = new PlayerRepositoryImpl();

			Scanner sc = new Scanner(System.in);
			int opcion;
			int score = 0;
			int i = 0;

			Player player = new Player();

			do {
				System.out.println("=== === === === === === === === === === === ===");
				System.out.println("=== === Bienvenido al juego de palabras === ===");
				System.out.println("=== === === === === === === === === === === ===");

				System.out.println("1. Comenzar juego nuevo");
				System.out.println("2. Mostrar puntajes");
				System.out.println("0. Salir");
				opcion = sc.nextInt();


				switch (opcion){
					case 1:
						System.out.println("Nombre del jugador: ");
						player.setName(sc.next());
						System.out.println("Digite: a, b, c, d segun sea la respuesta");
						Category1.categoria1();
						var r1 = sc.next();
						if(r1.equalsIgnoreCase("c")){
							score += 100;
						}else {
							System.out.println("***********-GAME OVER-***********");
							System.out.println("Respuesta incorrecta");
							score = score;
							player.setScore(score);
							repository.save(player);
							System.out.println("***********-SCORE-***********");
							repository.listPlayers().forEach(System.out::println);
							break;
						}
						System.out.println("***********-LEVEL 2-***********");
						Category2.categoria2();
						var r2 = sc.next();
						if(r2.equalsIgnoreCase("c")){
							score += 100;
						}else {
							System.out.println("***********-GAME OVER-***********");
							System.out.println("Respuesta incorrecta");
							score = score;
							player.setScore(score);
							repository.save(player);
							System.out.println("***********-SCORE-***********");
							repository.listPlayers().forEach(System.out::println);
							break;
						}
						System.out.println("***********-LEVEL 3-***********");
						Category3.categoria3();
						var r3 = sc.next();
						if(r3.equalsIgnoreCase("b")){
							score += 100;
						}else {
							System.out.println("***********-GAME OVER-***********");
							System.out.println("Respuesta incorrecta");
							score = score;
							player.setScore(score);
							repository.save(player);
							System.out.println("***********-SCORE-***********");
							repository.listPlayers().forEach(System.out::println);
							break;
						}
						System.out.println("***********-LEVEL 4-***********");
						Category4.categoria4();
						var r4 = sc.next();
						if(r4.equalsIgnoreCase("a")){
							score += 100;
						}else {
							System.out.println("***********-GAME OVER-***********");
							System.out.println("Respuesta incorrecta");
							score = score;
							player.setScore(score);
							repository.save(player);
							System.out.println("***********-SCORE-***********");
							repository.listPlayers().forEach(System.out::println);
							break;
						}
						System.out.println("***********-LEVEL 5-***********");
						Category5.categoria5();
						var r5 = sc.next();
						if(r5.equalsIgnoreCase("a")){
							score += 100;
						}else {
							System.out.println("***********-GAME OVER-***********");
							System.out.println("Respuesta incorrecta");
							score = score;
							player.setScore(score);
							repository.save(player);
							System.out.println("***********-SCORE-***********");
							repository.listPlayers().forEach(System.out::println);
							break;
						}

						player.setScore(score);
						repository.save(player);
						break;
					case 2:
						System.out.println("***********-SCORE-***********");
						repository.listPlayers().forEach(System.out::println);

						break;
					case 0:
						System.out.println("Hasta pronto!");
						System.exit(1);
						break;
					default:
						System.out.println("-					   -");
						System.out.println("Ingrese un número válido");
						System.out.println("-					   -");
						break;
				}
			}while (opcion != 2);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
