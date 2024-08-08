import java.util.Random;
public class Jester extends LowerClass implements Artist{
    //Random int
    public static int setRandomInt(int min, int max){
        Random random = new Random();
        return random.nextInt(min,max);
    }
    //String[] funnyJokes;
    //String[] notFunnyJokes;
    boolean humor;

    public Jester(boolean bow, /*String[] funnyJokes, String[] notFunnyJokes,*/ boolean humor, String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState,bow);
        //this.funnyJokes = funnyJokes;
        //this.notFunnyJokes = funnyJokes;
        this.humor = humor;
    }
    public static final String[]FunnyJokes = {
            "¿Qué hace una abeja en el gimnasio? ¡Zum-ba!",
            "¿Cuál es el animal más antiguo? La cebra, porque está en blanco y negro.",
            "¿Qué le dice un gusano a otro gusano? ¡Voy a dar una vuelta a la manzana!",
            "¿Cómo se llama el campeón de buceo japonés? Tokofondo.",
            "¿Qué hace un mudo bailando? Una mudanza.",
            "¿Cuál es el colmo de Aladdín? Tener mal genio.",
            "¿Cuál es el último animal que subió al arca de Noé? El del-fin.",
            "¿Cuál es el animal más peligroso de Internet? El mouse-tro.",
            "¿Por qué los robots no tienen amigos? Porque son todos circuitos cerrados.",
            "¿Por qué el smartphone fue al psicólogo? Porque tenía problemas de conexión emocional."


    };
    public static final String[]NotFunnyJokes = {
            "¿Qué le dice un jardinero a otro? Seamos felices mientras podamos.",
            "¿De qué murió Jack Sparrow? De un disparrow.",
            "¿Cómo se despiden los químicos? Ácido un gusto.",
            "¿Por qué un mago no sería bueno en el boxeo? Porque sería el magolpeado.",
            "¿Quién es el papá del príncipe azul? El Blu-ray.",
            "¿Cómo va Batman a su funeral? Batieso.",
            "Todo en la vida es pasajero. Menos el chófer.",
            "¿Cómo se dice puerta en inglés? Door. ¿Y el que las vende? Vendedoor. ¿Y el que las compra? Compradoor.",
            "¿Qué hace una vaca con los ojos cerrados? Leche concentrada.",
            "Iba a contar un chiste sobre sodio... pero Na.",
    };
    public void entertain(){
        if (humor) {
            System.out.println(firstname + " tells the joke: " + FunnyJokes[setRandomInt(0,9)] + " and everyone laughs.");
        } else {
            System.out.println(firstname + " tells the joke: " + NotFunnyJokes[setRandomInt(0,9)] + " and no one laughs.");
        }
    }
}
