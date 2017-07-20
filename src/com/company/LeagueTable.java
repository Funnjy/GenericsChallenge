package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Anton Ilchenko on 19.07.2017.
 */
public class LeagueTable<T extends Team> {
    private String leagueName;
    private String leagueFor;

    private ArrayList<T> teamList = new ArrayList<>();

    public LeagueTable(String leagueName, String leagueFor) {
        this.leagueName = leagueName;
        this.leagueFor = leagueFor;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getLeagueFor() {
        return leagueFor;
    }

    public boolean addTeam(T team) {
        if (teamList.contains(team)) {
            System.out.println(team.getName() + " is already assigned to the league");
            return false;
        } else {
            if (team.getSport() == (this.leagueFor)) {
                teamList.add(team);
                System.out.println(team.getName() + " have been added to the league");
                return true;
            }
            return false;
        }
    }

    public String printOut() {
        Collections.sort(teamList);

        String listOfTeams = "Teams participating in " + this.leagueName + ":\n";
        for (T t : teamList) {
            listOfTeams += t.getName() + " \n";
        }
        return listOfTeams;
    }
}
