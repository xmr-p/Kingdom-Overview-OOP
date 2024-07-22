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

    payTaxes(){
        System.out.println("Pay taxes");
    }
    betrayKingdom(){
        System.out.println("Betray kingdom");
    }
    inheritThrone(){
        System.out.println("inherit Throne");
    }
    unearthSword(){
        System.out.println("unearth Sword");
    }
}
