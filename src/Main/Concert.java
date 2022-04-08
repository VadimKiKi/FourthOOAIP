package Main;

public class Concert {
    public Faculty perform(String type){
        Faculty faculty;
        faculty=createCommand(type);
        faculty.performing();
        faculty.dance();
        faculty.sing();
        faculty.theatre();
        return faculty;
    }

    protected Faculty createCommand(String type) {
        Faculty faculty = null;
        TeamMembers teamMembers;
        if (type.equals("ПММ")){
             teamMembers = new AMMTeamMembers();
            faculty=new AMM(teamMembers);
            faculty.setName("ПММ");
        }
        else if (type.equals("ФКН")){
            teamMembers = new FCSTeamMembers();
            faculty=new FCS(teamMembers);
            faculty.setName("ФКН");
        }
        return faculty;
    }
}
