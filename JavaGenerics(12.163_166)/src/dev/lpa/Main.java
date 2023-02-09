package dev.lpa;

public class Main {
    public static void main(String[] args) {
        FootbalPlayer joe = new FootbalPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer backham = new SoccerPlayer("Beckham");

        Team<FootbalPlayer> adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(backham);

        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(backham);

        Team<FootbalPlayer> melboure = new Team<>("Melboure");
        FootbalPlayer banks = new FootbalPlayer("Gordon");
        melboure.addPlayer(banks);

        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(melboure.getName() + " : " + melboure.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melboure));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melboure.compareTo(fremantle));
    }
}
