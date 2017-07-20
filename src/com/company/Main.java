package com.company;

public class Main {

    public static void main(String[] args) {

//        Team<BasketballPlayer> baket = new Team("Basket", "Basketball");
        Team<SoccerPlayer> drabantTeam = new Team("Drabant team", "Soccer");
        Team<SoccerPlayer> lakes = new Team("Lakes", "Soccer");
        Team<SoccerPlayer> danver = new Team("Danver", "Soccer");
        Team<SoccerPlayer> memphes = new Team("Memphes", "Soccer");

        LeagueTable<Team<SoccerPlayer>> goldenLeague = new LeagueTable("Golden League", "Soccer");


        goldenLeague.addTeam(drabantTeam);
        goldenLeague.addTeam(lakes);
        goldenLeague.addTeam(memphes);
        goldenLeague.addTeam(danver);


        drabantTeam.matchResult(lakes, 4, 40);
        drabantTeam.matchResult(danver, 3, 20);
        drabantTeam.matchResult(memphes, 2, 10);

        System.out.println(goldenLeague.printOut());
    }
}
