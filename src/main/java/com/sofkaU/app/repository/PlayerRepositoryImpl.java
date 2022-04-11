package com.sofkaU.app.repository;

import com.sofkaU.app.db.ConnectionDB;
import com.sofkaU.app.model.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerRepositoryImpl implements PlayerRepository <Player> {

    private Connection getConnection() throws SQLException {
        return ConnectionDB.getInstance();
    }

    @Override
    public List<Player> listPlayers() {
        List<Player> players = new ArrayList<>();

        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM player")){

            while (rs.next()){
                Player p = new Player();
                p.setId(rs.getLong("id"));
                p.setName(rs.getString("nombreJugador"));
                p.setScore(rs.getInt("puntajeJugador"));
                players.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return players;
    }

    @Override
    public void save(Player player) {
        String sql = "INSERT INTO player(nombreJugador, puntajeJugador) VALUES (?, ?)";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, player.getName());
            stmt.setInt(2, player.getScore());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
