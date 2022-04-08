package Main;

public class AMM extends Faculty{
    TeamMembers teamMembers;
    @Override
    void performing() {
        System.out.println("Performing "+ name);
        dancer = teamMembers.dance();
        singer = teamMembers.sing();
        theatrePerson=teamMembers.theatre();
    }
    public AMM(TeamMembers teamMembers){
        this.teamMembers=teamMembers;
    }
}
