import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class King extends Person {
    private final String secret = "I'm afraid of rats";
    boolean trueKing;

    public King(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState, boolean trueKing) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState);
    }

    void makeDecree(String decree){
        List<String>decreesList
                = new ArrayList<String>(Arrays.asList(kingdom.decrees));
        decreesList.add(decree);
        kingdom.decrees = decreesList.toArray(kingdom.decrees);
        System.out.println("The King has made a new decree: " + decree);
    }
    void banish(Person personToBanish){
        personToBanish.banished = true;
        System.out.println("The person " + personToBanish.firstname + " " + personToBanish.paternalSurname + " has been banished!");
    }
}
