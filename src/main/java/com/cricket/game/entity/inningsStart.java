package com.cricket.game.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

//start of an inning

public class inningsStart {

    private final innings in;

    public inningsStart(innings ini,Integer id,Integer c,Integer target) {
        this.in = ini;
        System.out.println(in.getTarget());
        in.setinnings(id,(Integer) c,(Integer) 0,(Integer) 0,target,(Integer) 0);
    }
    public void startinnings(){
        // for one inning the main part where the random runs and wickets are increasing
        while(in.getBallplayed()<= 120 && in.getTotalWicket()<10 && in.getTotalRun()<in.getTarget()){
            int runperball=ThreadLocalRandom.current().nextInt(0,8);
            in.increaseBall();
            if(runperball==7){
                in.increaseWicket();
                System.out.println("Wicket");
            }
            else{
                in.increaseRun(runperball);
                System.out.println("It's a "+ runperball + " team "+ in.getTeamIdPlaying() + " playing and total run " + in.getTotalRun());
            }
        }
        System.out.println("End of inning , Team "+ in.getTeamIdPlaying() + " scored "+ in.getTotalRun()+ " by loosing "+ in.getTotalWicket());

    }
}
