package com.cricket.game.service;

import com.cricket.game.dataaccess.playeraccess;
import com.cricket.game.entity.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class playerService {
    @Autowired
    private playeraccess playerAccess;

    @Autowired
    private MongoTemplate mongoTemplate;

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

    public player updatePlayer(player p1){
        return playerAccess.updatePlayer(p1);
    }

    public List<player> findtop3batsman(){
        Query q1 = new Query().addCriteria(Criteria.where("type").is("batsman"))
                .with(Sort.by(Sort.Order.desc("runScored")))
                .limit(3);
        return mongoTemplate.find(q1,player.class);
    }
    public List<player> findtop3bowler(){
        Query q1 = new Query().addCriteria(Criteria.where("type").is("bowler"))
                .with(Sort.by(Sort.Order.desc("wicketTaken")))
                .limit(3);
        return mongoTemplate.find(q1,player.class);
    }

    public List<player> findCenturians(){
        Query q1= new Query().addCriteria(Criteria.where("type").is("batsman").gt(0));

        return mongoTemplate.find(q1,player.class);
    }

}
