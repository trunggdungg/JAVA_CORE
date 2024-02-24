package entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SummonRift {
    private List<Team> teams;

    private  String starTime;

    public SummonRift(List<Team> teams, String starTime) {
        this.teams = teams;
        this.starTime = starTime;
    }

    public SummonRift() {
    }

    public SummonRift(List<Team> teams, LocalTime localTime) {
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                ", starTime='" + starTime + '\'' +
                '}';
    }
}
