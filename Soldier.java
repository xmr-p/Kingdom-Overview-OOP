public class Soldier {
    String rank;
    String position;
    String[] dailyTasks;
    Weapon[] weapons;

    public Soldier(String rank, String position, String[] dailyTasks, Weapon[] weapons) {
        this.rank = rank;
        this.position = position;
        this.dailyTasks = dailyTasks;
        this.weapons = weapons;
    }
}
