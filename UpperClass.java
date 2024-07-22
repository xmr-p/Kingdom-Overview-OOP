public class UpperClass extends Person{
    int voteValue;

    public UpperClass(int voteValue) {
        this.voteValue = voteValue;
    }

    void commandLowerClass(){
        System.out.println("I'm the boss");
    }
}
