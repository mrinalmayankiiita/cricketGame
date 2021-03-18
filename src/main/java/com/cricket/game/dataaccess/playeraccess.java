package com.cricket.game.dataaccess;

import com.cricket.game.entity.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
public class playeraccess {
    @Autowired
    private playerdata playerData;
    public Collection<player> getPlayer() {
        return playerData.findAll();
    }

    public player createPlayer(player p1) {
        return playerData.insert(p1);
    }

    public Optional<player> getPlayerById(int id) {
        return playerData.findById(id);
    }

    public player updatePlayer(player p1){
        return playerData.save(p1);
    }
    public Optional<player> deletePlayerById(int id) {
        Optional<player> p1 = playerData.findById(id);
        p1.ifPresent(b -> playerData.delete(b));
        return p1;
    }

}
