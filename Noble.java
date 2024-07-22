public class Noble extends UpperClass{
    boolean isSoldier;
    Soldier soldierType;

    public Noble(int voteValue, boolean isSoldier) {
        super(voteValue);
        this.isSoldier = isSoldier;
    }
}
