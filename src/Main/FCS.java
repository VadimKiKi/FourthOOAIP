package Main;

public class FCS extends Faculty{
    TeamMembers teamMembers;
    @Override
    void performing() {
        System.out.println("Performing " + name);
        dancer = teamMembers.dance();
        singer = teamMembers.sing();
        theatrePerson=teamMembers.theatre();
    }
    public FCS(TeamMembers teamMembers){
        this.teamMembers=teamMembers;
    }
}
