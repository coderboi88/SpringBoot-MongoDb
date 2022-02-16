package com.aditya.cricketapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection= "match")
public class Match {
    @Id
    private int matchId;
    private int noOfOver;
    private int noOfWicket;

    public Match() {
    }

    public Match(int matchId, int noOfOver, int noOfWicket) {
        this.matchId = matchId;
        this.noOfOver = noOfOver;
        this.noOfWicket = noOfWicket;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getNoOfOver() {
        return noOfOver;
    }

    public void setNoOfOver(int noOfOver) {
        this.noOfOver = noOfOver;
    }

    public int getNoOfWicket() {
        return noOfWicket;
    }

    public void setNoOfWicket(int noOfWicket) {
        this.noOfWicket = noOfWicket;
    }
}
