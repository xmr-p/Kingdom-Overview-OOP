public class Musician extends LowerClass implements Artist{
    Instrument[] instruments;
    boolean tune;

    public Musician(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState);
    }

    public void entertain(){
        System.out.println("Entertain");
    }
}
