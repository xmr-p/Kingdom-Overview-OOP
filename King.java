public class King extends Person{
    private final String secret = "I'm afraid of rats";
    boolean trueKing;

    void makeDecree(String decree){
        System.out.println("New Decree");
    }
    void banish(String name){
        System.out.println("You're banish");
    }
}
