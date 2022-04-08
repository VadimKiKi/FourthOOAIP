package Main;

public class AMMTeamMembers implements TeamMembers{
    @Override
    public Dancer dance() {
        return new DancerAMM();
    }

    @Override
    public Singer sing() {
        return new SingerAMM();
    }

    @Override
    public Theatre theatre() {
        return new TheatreAMM();
    }
}
