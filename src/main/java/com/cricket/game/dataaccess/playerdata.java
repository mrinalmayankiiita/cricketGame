package com.cricket.game.dataaccess;

import com.cricket.game.entity.player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface playerdata extends MongoRepository<player,Integer> {

}
