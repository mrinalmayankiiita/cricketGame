package com.cricket.game.entity;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.List;

public class team {
    private Integer teamId;
    private String teamName;
    private List<player> teamPlayers;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<player> getTeamPlayers() {
        return teamPlayers;
    }

    public void addTeamPlayers(player Player) {
        this.teamPlayers.add(Player);
    }
}
