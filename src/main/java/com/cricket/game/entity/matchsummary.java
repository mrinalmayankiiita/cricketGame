package com.cricket.game.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class matchsummary {
    private String winner;
    @Autowired
    private matchScore sc;
    //private innings in;
    //private matchScore matchScore;

    public String getWinner(matchScore sc){
        this.sc=sc;
        if(sc.getRunsbyteam2()> sc.getRunsbyteam1()){
            this.winner=sc.getTeam2().toString();
            return "Team "+winner +" is the winner";
        }
        else if(sc.getRunsbyteam2() == sc.getRunsbyteam1()){
            this.winner="tie";
            return "Tie";
        }
        else{
            this.winner=sc.getTeam1().toString();

            return "Team "+winner +" is the winner";
        }
    }
}
