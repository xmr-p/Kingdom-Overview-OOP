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
        System.out.println("Pay taxes");
    }
    void betrayKingdom(){
        System.out.println("Betray kingdom");
    }
    void inheritThrone(){
        System.out.println("inherit Throne");
    }
    void unearthSword(){
        System.out.println("unearth Sword");
    }
}
