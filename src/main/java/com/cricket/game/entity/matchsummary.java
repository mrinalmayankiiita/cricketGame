package com.cricket.game.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//match summary

public class matchsummary {
    private String winner;


    private matchScore sc;


    public String getWinner(matchScore sc){ // to decide who is winner of the match
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
