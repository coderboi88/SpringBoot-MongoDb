package com.aditya.cricketapi.repository;

import com.aditya.cricketapi.model.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends MongoRepository<Match,Integer> {
    public Match findByMatchId(int matchId);
}
