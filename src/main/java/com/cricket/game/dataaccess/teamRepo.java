package com.cricket.game.dataaccess;

import com.cricket.game.entity.team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface teamRepo extends MongoRepository<team, Integer> {

}
