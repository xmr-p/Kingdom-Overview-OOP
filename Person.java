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
