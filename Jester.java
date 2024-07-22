public class Jester extends LowerClass implements Artist{
    String[] jokes;
    boolean humor;

    public Jester(boolean bow, String[] jokes, boolean humor) {
        super(bow);
        this.jokes = jokes;
        this.humor = humor;
    }

    public void entertain(){
        System.out.println("Entertain");
    }
}
