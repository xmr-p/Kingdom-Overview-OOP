public class Jester extends LowerClass implements Artist{
    String[] jokes;
    boolean humor;

    public Jester(boolean bow, String[] jokes, boolean humor, String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState,bow);
        this.jokes = jokes;
        this.humor = humor;
    }

    public void entertain(){
        if (humor) {
            System.out.println(firstname + " tells the joke: " + jokes[0] + " and everyone laughs.");
        } else {
            System.out.println(firstname + " tells the joke: " + jokes[0] + " and no one laughs.");
        }
    }
}
