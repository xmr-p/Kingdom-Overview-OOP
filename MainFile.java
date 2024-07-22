public class MainFile {
    public static void main(String[] args) {
        System.out.println("Main!");
        Kingdom kingdom1 = new Kingdom("K1", "C://path/to/file.png", "Norte de algo", "coin1", new String[]{""}, new String[]{"K2", "K3"});
        King king1 = new King("Mr.", "Rey", "Reyes", true, true, false, false, true, 100.0f, 1000.5f, 0.15f, 28, kingdom1, Occupation.KING, HealthState.HEALTHY, false);
        king1.makeDecree("Decree1");
    }
}
