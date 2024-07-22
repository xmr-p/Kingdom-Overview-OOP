public class MainFile {
    public static void main(String[] args) {
        System.out.println("Main!");
        Kingdom kingdom1 = new Kingdom("K1", "C://path/to/file.png", "Norte de algo", "coin1", new String[]{""}, new String[]{"K2", "K3"});
        King king1 = new King("Mr.", "Rey", "Reyes", true, true, false, false, true, 100.0f, 1000.5f, 0.15f, 28, kingdom1, Occupation.KING, HealthState.HEALTHY, false);
        king1.makeDecree("Decree1");
        Jester jester1 = new Jester(true,new String[]{"joke1","joke2"},false,"Brincos Dieras","Morales","García",true,true,false,true,false,500.2f,156489.8f,0.3f,20,kingdom1,Occupation.JESTER,HealthState.PLAGUED);
    }
}
