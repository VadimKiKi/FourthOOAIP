package Main;

public class FCSTeamMembers implements TeamMembers{
    @Override
    public Dancer dance() {
        return new DancerFCS();
    }

    @Override
    public Singer sing() {
        return new SingerFCS();
    }

    @Override
    public Theatre theatre() {
        return new TheatreFCS();
    }
}
