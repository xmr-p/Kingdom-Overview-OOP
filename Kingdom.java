public class Kingdom {
    String name;
    String flag;
    String location;
    String currency;
    String [] decrees;
    String [] alliedKingdoms;

    public Kingdom(String name, String flag, String location, String currency, String[] decrees, String[] alliedKingdoms) {
        this.name = name;
        this.flag = flag;
        this.location = location;
        this.currency = currency;
        this.decrees = decrees;
        this.alliedKingdoms = alliedKingdoms;
    }
}
