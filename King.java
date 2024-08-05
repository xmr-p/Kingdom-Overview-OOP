public class King extends Person {
    private final String secret = "I'm afraid of rats";
    boolean trueKing;

    public King(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState, boolean trueKing) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState);
    }

    void makeDecree(String decree){
        System.out.println("New Decree");
    }
    void banish(String name){
        System.out.println("You're banish");
    }
}
