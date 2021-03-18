package com.cricket.game.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "teams")
public class team {
    @Id
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
