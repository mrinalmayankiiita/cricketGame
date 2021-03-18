package com.cricket.game.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

//starting a match
@Service
public class matchstart {
    @Autowired
    private innings in1;

    @Autowired
    private innings in2;

    public void startmatch() {

        int c= ThreadLocalRandom.current().nextInt(1,3);

        inningsStart ins1 = new inningsStart(in1,1,c,Integer.MAX_VALUE);
        ins1.startinnings();
        inningsStart ins2 = new inningsStart(in2,2,3-c,in1.getTotalRun()+1);
        ins2.startinnings();

        matchScore newmatchScore = new matchScore(in1.getTotalRun(), in2.getTotalRun(), in1.getTotalWicket(),in2.getTotalWicket(),c,3-c);

        matchsummary newsummary = new matchsummary();
        System.out.println(newsummary.getWinner(newmatchScore));

    }
}
