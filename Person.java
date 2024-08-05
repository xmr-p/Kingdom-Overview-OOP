public abstract class Person {
    String firstname;
    String paternalSurname;
    String maternalSurname;
    boolean gender;
    boolean royalBlood;
    boolean darknessInside;
    boolean banished;
    boolean hasEducation;
    float wage;
    float fortune;
    float taxes;
    int age;
    Kingdom kingdom;
    Occupation occupation;
    HealthState healthState;

    public Person(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState) {
        this.firstname = firstname;
        this.paternalSurname = paternalSurname;
        this.maternalSurname = maternalSurname;
        this.gender = gender;
        this.royalBlood = royalBlood;
        this.darknessInside = darknessInside;
        this.banished = banished;
        this.hasEducation = hasEducation;
        this.wage = wage;
        this.fortune = fortune;
        this.taxes = taxes;
        this.age = age;
        this.kingdom = kingdom;
        this.occupation = occupation;
        this.healthState = healthState;
    }

    void payTaxes(){
        float amount = wage * taxes;
        fortune -= amount;
        System.out.println(amount + " amount of" + kingdom.currency + " were payed as taxes.");
    }
    void betrayKingdom(King king){
        if (royalBlood) {
            System.out.println(firstname + "betrayed the kingdom, but as he had royal blood he got a pardon.");
        } else {
            System.out.println(firstname + " betrayed the kingdom.");
            king.banish(this);
        }
    }
    void inheritThrone(King king){
        if (royalBlood && paternalSurname.equals(king.paternalSurname)) {
            king.occupation = Occupation.NOBLE;
            occupation = Occupation.KING;
            System.out.println("A new King has taken the throne! All hail " + firstname + "!");
        }
    }
    void unearthSword(King king){
        if (royalBlood && paternalSurname.equals(king.paternalSurname) && firstname.equals("Arthur")) {
            System.out.println("The King's Sword has been unearthed by the True King!");
        }
    }
}
