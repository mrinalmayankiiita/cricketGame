package com.cricket.game.controller;

import com.cricket.game.entity.matchstart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//starting the game through api call
@RestController
public class gamestarter {
    @Autowired
    private matchstart match1;
    @GetMapping
    public void start(){
        match1.startmatch();
    }
}
