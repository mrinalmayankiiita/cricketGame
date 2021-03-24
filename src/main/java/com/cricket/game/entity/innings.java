package com.cricket.game.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//class for one inning
@Component
@Scope("prototype")
public class innings {
    private Integer inNo;
    private Integer teamIdPlaying;
    private Integer totalRun;
    private Integer ballplayed;
    private Integer totalWicket;
    private Integer target;

    public Integer getBallplayed() {
        return ballplayed;
    }

    public void setBallplayed(Integer ballplayed) {
        this.ballplayed = ballplayed;
    }

    public void setinnings(Integer inNo, Integer teamIdPlaying, Integer totalRun, Integer totalWicket, Integer target, Integer ballplayed) {
        this.inNo = inNo;
        this.teamIdPlaying = teamIdPlaying;
        this.totalRun = totalRun;
        this.totalWicket = totalWicket;
        this.target = target;
        this.ballplayed=ballplayed;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public Integer getInNo() {
        return inNo;
    }

    public void setInNo(Integer inNo) {
        this.inNo = inNo;
    }

    public Integer getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(Integer totalRun) {
        this.totalRun = totalRun;
    }

    public Integer getTotalWicket() {
        return totalWicket;
    }

    public void setTotalWicket(Integer totalWicket) {
        this.totalWicket = totalWicket;
    }

    public Integer getTeamIdPlaying() {
        return teamIdPlaying;
    }

    public void setTeamIdPlaying(Integer teamIdPlaying) {
        this.teamIdPlaying = teamIdPlaying;
    }

    public void increaseRun(Integer run){
        this.totalRun = this.totalRun+ run;
    }

    public void increaseWicket(){
        this.totalWicket++;
    }
    public void increaseBall(){
        this.ballplayed++;
    }

}
