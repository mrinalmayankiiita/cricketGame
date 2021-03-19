package com.cricket.game.service;

import com.cricket.game.dataaccess.teamRepo;
import com.cricket.game.entity.team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teamService {
    @Autowired
    private teamRepo teamrepo;

    public void addTeam(team t1){
        teamrepo.insert(t1);
    }
}
