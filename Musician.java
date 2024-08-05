public class Musician extends LowerClass implements Artist{
    Instrument[] instruments;
    boolean tune;

    public Musician(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState, boolean bow, Instrument[] instruments, boolean tune) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState, bow);
        this.instruments = instruments;
        this.tune = tune;
    }

    public void entertain(){
        if (tune) {
            System.out.println(firstname + " plays his instrument, producing a beautiful " + instruments[0].sound + " sound.");
        } else {
            System.out.println(firstname + " plays his instrument, producing a horrible " + instruments[0].sound + " sound.");
        }
    }
}
