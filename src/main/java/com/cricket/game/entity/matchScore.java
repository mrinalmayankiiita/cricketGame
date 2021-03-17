package com.cricket.game.entity;

public class matchScore {
    private Integer runsbyteam1,runsbyteam2;
    private Integer wicketsteam1,wicketsteam2;
    private Integer team1 , team2;


    public matchScore(Integer runsbyteam1, Integer runsbyteam2, Integer wicketsteam1, Integer wicketsteam2, Integer teamid1, Integer team1d2) {
        this.runsbyteam1 = runsbyteam1;
        this.runsbyteam2 = runsbyteam2;
        this.wicketsteam1 = wicketsteam1;
        this.wicketsteam2 = wicketsteam2;
        this.team1 = teamid1;
        this.team2 = team1d2;
    }

    public Integer getRunsbyteam1() {
        return runsbyteam1;
    }

    public void setRunsbyteam1(Integer runsbyteam1) {
        this.runsbyteam1 = runsbyteam1;
    }

    public Integer getRunsbyteam2() {
        return runsbyteam2;
    }

    public void setRunsbyteam2(Integer runsbyteam2) {
        this.runsbyteam2 = runsbyteam2;
    }

    public Integer getWicketsteam1() {
        return wicketsteam1;
    }

    public void setWicketsteam1(Integer wicketsteam1) {
        this.wicketsteam1 = wicketsteam1;
    }

    public Integer getWicketsteam2() {
        return wicketsteam2;
    }

    public void setWicketsteam2(Integer wicketsteam2) {
        this.wicketsteam2 = wicketsteam2;
    }
    public Integer getTeam1() {
        return team1;
    }

    public void setTeam1(Integer team1) {
        this.team1 = team1;
    }

    public Integer getTeam2() {
        return team2;
    }

    public void setTeam2(Integer team2) {
        this.team2 = team2;
    }
}
