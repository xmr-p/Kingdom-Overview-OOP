public class MainFile {
    public static void main(String[] args) {
        System.out.println("Main!");
        Kingdom kingdom1 = new Kingdom("K1", "C://path/to/file.png", "Norte de algo", "coin1", new String[]{""}, new String[]{"K2", "K3"});
        King king1 = new King("Mr.", "Rey", "Reyes", true, true, false, false, true, 100.0f, 1000.5f, 0.15f, 28, kingdom1, Occupation.KING, HealthState.HEALTHY, false);
        king1.makeDecree("Decree1");
        //Weapons
        Weapon sword = new Weapon("slice",0.7f,Occupation.VILLAGER);
        Weapon flail = new Weapon("punch",2.3f,Occupation.VILLAGER);
        Weapon spear = new Weapon("bury",1.8f,Occupation.NOBLE);
        //Soldier
        Soldier royalGuard = new Soldier("Royal Guard","vanguard",new String[]{"patrol","guard","escort","train","report"},new Weapon[]{spear});
        Soldier squire = new Soldier("Squire","rear guard",new String[]{"assist","clean","train","fetch","polish"},new Weapon[]{sword,flail});
        //Tools
        Tool tool1 = new Tool(10);
        Tool tool2 = new Tool(16);
        Tool tool3 = new Tool(18);
        //Instrument
        Instrument instrument1 = new Instrument("piano");
        Instrument instrument2 = new Instrument("sax");
        //Upper Class
        Noble noble1 = new Noble("Téofilo","Casablanca","Rivera",true,false,true,false,true,789.5f,8941.3f,0.15f,22,kingdom1,Occupation.NOBLE,HealthState.HEALTHY,5,true, royalGuard);
        UpperClass count = new UpperClass("Count1","Hdz","Jimenez",false,true,false,false,true,741.8f,9632.4f,0.15f,20,kingdom1,Occupation.COUNT,HealthState.HEALTHY,3);
        UpperClass baron = new UpperClass("baron1","Rezéndiz","Linares",true,true,true,false,true,852.1f,621.2f,7412.2f,21,kingdom1,Occupation.BARON,HealthState.PLAGUED,2);
        UpperClass duke = new UpperClass("Diana","Ballesteros","Miñonet",false,true,false,false,true,741.9f,8921.8f,0.15f,18,kingdom1,Occupation.DUKE,HealthState.HEALTHY,1);
        //Lower Class
            //Villagers
        Villager villager1 = new Villager(false,noble1,squire,new Tool[] {tool1},true,"Éder","Muñóz","Castro",true,false,false,false,false,126.8f,382.9f,0.30f,12,kingdom1,Occupation.VILLAGER,HealthState.HEALTHY);
        Villager villager2 = new Villager(true,noble1,squire,new Tool[] {tool2},true,"Damian","Jiménez","Torruco",true,true,false,false,false,130.4f,340.7f,0.3f,14,kingdom1,Occupation.VILLAGER,HealthState.PLAGUED);
            //Jesters
        Jester jester1 = new Jester(true,new String[]{"joke1","joke2"},false,"Brincos Dieras","Morales","García",true,true,false,true,false,500.2f,156489.8f,0.3f,20,kingdom1,Occupation.JESTER,HealthState.PLAGUED);
        Jester jester2 = new Jester(false,new String[]{"joke1","joke2"}, true,"Polo Polo","Hernández","Rosales",false,false,true,false,false,123.8f,1984.9f,0.3f,16,kingdom1,Occupation.JESTER,HealthState.HEALTHY);
            //Musicians
        Musician musician1 = new Musician("Bethoven","Zárate","Villalobos",true,false,true,true,false,100.7f,745.9f,0.3f,12,kingdom1,Occupation.MUSICIAN,HealthState.HEALTHY,false,new Instrument[]{},true);
        Musician musician2 = new Musician("Ruth la de las plantas","Pérez","Castañeda",false,false,false,false,false,203.9f,952.1f,0.3f,21,kingdom1,Occupation.MUSICIAN,HealthState.PLAGUED,false,new Instrument[]{},false);

    }
}
