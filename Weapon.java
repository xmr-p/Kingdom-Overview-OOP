public class Weapon {
    String attackType;
    float weight;
    Occupation allowedClass;

    public Weapon(String attackType, float weight, Occupation allowedClass) {
        this.attackType = attackType;
        this.weight = weight;
        this.allowedClass = allowedClass;
    }

    void attack() {
        System.out.println("The weapon does a " + attackType + " attack!");
    }
}
