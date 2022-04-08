package Main;

abstract public class Faculty {
    String name;
    Dancer dancer;
    Singer singer;
    Theatre theatrePerson;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    abstract void performing();
    void dance(){
        System.out.println("Танцуем!");
    }
    void sing(){
        System.out.println("Поем!");
    }
    void theatre(){
        System.out.println("Играем сценку!");
    }
}
