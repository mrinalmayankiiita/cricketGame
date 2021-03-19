package com.cricket.game.controller;

import com.cricket.game.entity.team;
import com.cricket.game.service.teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("team")
public class teamController {
    @Autowired
    private teamService teamservice;

    @PostMapping
    public void addTeam(team t1){
        teamservice.addTeam(t1);
    }
}
