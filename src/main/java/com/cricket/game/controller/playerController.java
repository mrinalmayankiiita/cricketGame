package com.cricket.game.controller;


import com.cricket.game.entity.player;
import com.cricket.game.service.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("player")
public class playerController {
    @Autowired
    private playerService Playerser;

    @GetMapping
    public Collection<player> getPlayer(){ return Playerser.getPlayer();}

    @PostMapping
    public player postplayer(@RequestBody player player) {
        return Playerser.createPlayer(player);
    }

    @GetMapping(value="/{id}")
    public Optional<player> getplayerById(@PathVariable("id") int id) {
        return Playerser.getPlayerById(id);
    }

    @DeleteMapping(value="/{id}")
    public Optional<player> deleteplayerById(@PathVariable("id") int id) {
        return Playerser.deletePlayerById(id);
    }


}
