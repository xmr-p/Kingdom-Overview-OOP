public class UpperClass extends Person{
    int voteValue;

    public UpperClass(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState);
    }

    void commandLowerClass(){
        System.out.println("I'm the boss");
    }
}
