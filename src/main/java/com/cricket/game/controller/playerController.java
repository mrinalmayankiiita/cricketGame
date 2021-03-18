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
    private playerService Playerservice;
    //get list of all player
    @GetMapping
    public Collection<player> getPlayer(){ return Playerservice.getPlayer();}
    //create a player
    @PostMapping
    public player postplayer(@RequestBody player player) {
        return Playerservice.createPlayer(player);
    }
    //get a player by id
    @GetMapping(value="/{id}")
    public Optional<player> getplayerById(@PathVariable("id") int id) {
        return Playerservice.getPlayerById(id);
    }

    //delete a player by id
    @DeleteMapping(value="/{id}")
    public Optional<player> deleteplayerById(@PathVariable("id") int id) {
        return Playerservice.deletePlayerById(id);
    }

    //update a player
    @GetMapping("/update")
    public player update(player p1){
        return Playerservice.updatePlayer(p1);
    }
    // find top3 batsman based on total runs
    @GetMapping("/top3batsman")
    public List<player> getTop3Batsman(){
        return Playerservice.findtop3batsman();
    }
    // find best 3 bowlers based on total wickets
    @GetMapping("/top3bowler")
    public List<player> getTop3Bowler(){
        return Playerservice.findtop3bowler();
    }

    // find batsman who have made atleast one centuries.
    @GetMapping("findCenturians")
    public List<player> getCenturyPlayers(){
        return Playerservice.findCenturians();
    }

}
