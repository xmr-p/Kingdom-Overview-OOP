public class Villager extends LowerClass{
    UpperClass boss;
    boolean isSoldier;
    Soldier soldierType;
    Tool[] tools;

    public Villager(boolean bow, UpperClass boss, Soldier soldierType, Tool[] tools, boolean isSoldier, String firstname, String paternalSurname, String maternalSurname, boolean gender, boolean royalBlood, boolean darknessInside, boolean banished, boolean hasEducation, float wage, float fortune, float taxes, int age, Kingdom kingdom, Occupation occupation, HealthState healthState) {
        super(firstname, paternalSurname, maternalSurname, gender, royalBlood, darknessInside, banished, hasEducation, wage, fortune, taxes, age, kingdom, occupation, healthState,bow);
        this.boss = boss;
        this.isSoldier = isSoldier;
        this.soldierType = soldierType;
        this.tools = tools;
    }
}
