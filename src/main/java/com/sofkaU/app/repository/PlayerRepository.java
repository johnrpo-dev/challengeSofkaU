package com.sofkaU.app.repository;

import java.util.List;

public interface PlayerRepository <T> {
    List<T> listPlayers();


    void save (T t);

}
