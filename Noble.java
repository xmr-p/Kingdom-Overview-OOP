public class Noble extends UpperClass{
    boolean isSoldier;
    Soldier soldierType;

    public Noble(String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState, int voteValue, boolean isSoldier, Soldier soldierType) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState, voteValue);
        this.isSoldier = isSoldier;
        this.soldierType = soldierType;
    }
}
