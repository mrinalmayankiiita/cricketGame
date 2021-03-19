package com.cricket.game.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "player")
public class player {
    @Id
    private Integer id;
    private String name;
    private String team;
    private String type;
    @Indexed(name = "totalrun")
    private Integer runScored;
    private Integer centuries;
    private Integer playingInAt;
    @Indexed(name = "totalwicket")
    private Integer wicketTaken;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPlayingInAt() {
        return playingInAt;
    }

    public void setPlayingInAt(Integer playingInAt) {
        this.playingInAt = playingInAt;
    }

    public Integer getWicketTaken() {
        return wicketTaken;
    }

    public void setWicketTaken(Integer wicketTaken) {
        this.wicketTaken = wicketTaken;
    }

    public Integer getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(Integer noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public Integer getNoOfInnings() {
        return noOfInnings;
    }

    public void setNoOfInnings(Integer noOfInnings) {
        this.noOfInnings = noOfInnings;
    }

    private Integer noOfMatches;
    private Integer noOfInnings;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getRunScored() {
        return runScored;
    }

    public void setRunScored(Integer runScored) {
        this.runScored = runScored;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCenturies() {
        return centuries;
    }

    public void setCenturies(Integer centuries) {
        this.centuries = centuries;
    }

}
