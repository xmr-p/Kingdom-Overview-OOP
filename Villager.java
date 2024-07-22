public class Villager extends LowerClass{
    UpperClass boss;
    boolean isSoldier;
    Soldier soldierType;
    Tool[] tools;

    public Villager(boolean bow, UpperClass boss, boolean isSoldier, Soldier soldierType, Tool[] tools) {
        super(bow);
        this.boss = boss;
        this.isSoldier = isSoldier;
        this.soldierType = soldierType;
        this.tools = tools;
    }
}
