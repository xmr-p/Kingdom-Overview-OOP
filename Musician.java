public class Musician extends LowerClass implements Artist{
    Instrument[] instruments;
    boolean tune;

    public Musician(boolean bow, Instrument[] instruments, boolean tune) {
        super(bow);
        this.instruments = instruments;
        this.tune = tune;
    }

    public void entertain(){
        System.out.println("Entertain");
    }
}
