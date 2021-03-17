package com.cricket.game.service;

import com.cricket.game.dataaccess.playeraccess;
import com.cricket.game.entity.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class playerService {
    @Autowired
    private playeraccess playerAccess;

    public Collection<player> getPlayer() {
        return playerAccess.getPlayer();
    }

    public player createPlayer(player Player) {
        return playerAccess.createPlayer(Player);
    }

    public Optional<player> getPlayerById(int id) {
        return playerAccess.getPlayerById(id);
    }

    public Optional<player> deletePlayerById(int id) {
        return playerAccess.deletePlayerById(id);
    }


}
