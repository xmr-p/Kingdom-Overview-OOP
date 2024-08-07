import java.util.Random;
public class MainFile {
    //Random health
    public static HealthState setRandomHealth(){
        HealthState[] healthStates = HealthState.values();
        Random random = new Random();
        int randomIndex = random.nextInt(2);
        return healthStates[randomIndex];
    }
    //Random royalBlood
    public static boolean setRandomBool(){
        Random random = new Random();
        return random.nextBoolean();
    }
    public static void main(String[] args) {
        //Main
        System.out.println("Main!");
        Kingdom kingdom1 = new Kingdom("Kingdom of ITI", "C://path/to/file.png", "North Hemisphere", "ITIcoin", new String[]{""}, new String[]{"K2", "K3"});
        King king1 = new King("Mr.", "Rey", "Reyes", true, true, false, false, true, 100.0f, 1000.5f, 0.15f, 28, kingdom1, Occupation.KING, HealthState.HEALTHY, false);
        king1.makeDecree("Decree1");
        king1.makeDecree("Decree2");
        //Weapons
            //Slice
        Weapon sword = new Weapon("slice",0.7f,Occupation.VILLAGER);
        Weapon falchion = new Weapon("slice",1.3f,Occupation.VILLAGER);
            //Punch
        Weapon flail = new Weapon("punch",2.3f,Occupation.VILLAGER);
        Weapon morningStar = new Weapon("punch",2.8f,Occupation.VILLAGER);
            //Stab
        Weapon spear = new Weapon("stab",1.8f,Occupation.NOBLE);
        Weapon pike = new Weapon("stab",3.4f,Occupation.NOBLE);
        //Soldier
        Soldier royalGuard1 = new Soldier("Royal Guard","vanguard",new String[]{"patrol","guard","escort","train","report"},new Weapon[]{spear});
        Soldier royalGuard2 = new Soldier("Royal Guard","vanguard",new String[]{"protect King","ceremonial duties","enforce orders","escort VIPs","guard castle"},new Weapon[]{pike});
        Soldier squire1 = new Soldier("Squire","rear guard",new String[]{"assist","clean","train","fetch","polish"},new Weapon[]{sword,flail});
        Soldier squire2 = new Soldier("Squire","rear guard",new String[]{"maintain armor","attend training","run errands","prepare horses","serve meals"},new Weapon[]{falchion,morningStar});

        //Tools
        Tool tool1 = new Tool(10);
        Tool tool2 = new Tool(16);
        Tool tool3 = new Tool(18);
        //Instrument
        Instrument instrument1 = new Instrument("piano");
        Instrument instrument2 = new Instrument("sax");
        //Upper Class
        Noble noble1 = new Noble("Don Juan","de Habsburgo","Rivera",true,setRandomBool(),setRandomBool(),false,true,789.5f,8941.3f,0.15f,22,kingdom1,Occupation.NOBLE,setRandomHealth(),5,true, royalGuard1);
        System.out.println(noble1.health());
        Noble noble2 = new Noble("Don Pedro","de la Vega","y Cortés",true,setRandomBool(),setRandomBool(),false,true,789.5f,8941.3f,0.15f,22,kingdom1,Occupation.NOBLE,setRandomHealth(),5,true, royalGuard2);
        UpperClass count1 = new UpperClass("Don Fernando","Silva","Jimenez",true,setRandomBool(),setRandomBool(),false,true,741.8f,9632.4f,0.15f,20,kingdom1,Occupation.COUNT,setRandomHealth(),3);
        UpperClass count2 = new UpperClass("Doña Beatriz","de Silva","Villalobos",false,setRandomBool(),setRandomBool(),false,true,541.8f,9632.4f,0.15f,20,kingdom1,Occupation.COUNT,setRandomHealth(),3);
        UpperClass baron1 = new UpperClass("Don Luis","Castilla","Linares",true,setRandomBool(),setRandomBool(),false,true,852.1f,621.2f,0.15f,21,kingdom1,Occupation.BARON,setRandomHealth(),2);
        UpperClass baron2 = new UpperClass("Doña Ana","de Castilla","Cuevas",false,setRandomBool(),setRandomBool(),false,true,852.1f,621.2f,0.15f,21,kingdom1,Occupation.BARON,setRandomHealth(),2);
        UpperClass duke1 = new UpperClass("Don Miguel","Borbón","y Valois",true,setRandomBool(),setRandomBool(),false,true,741.9f,8921.8f,0.15f,18,kingdom1,Occupation.DUKE,setRandomHealth(),1);
        UpperClass duke2 = new UpperClass("Doña Esmeralda","de Borbón","Mendoza",false,setRandomBool(),setRandomBool(),false,true,741.9f,8921.8f,0.15f,18,kingdom1,Occupation.DUKE,setRandomHealth(),1);
        //Lower Class
            //Villagers
        Villager villager1 = new Villager(false,noble1,squire1,new Tool[] {tool1},true,"Éder","Muñóz","Castro",true,setRandomBool(),setRandomBool(),false,false,126.8f,382.9f,0.3f,12,kingdom1,Occupation.VILLAGER,setRandomHealth());
        Villager villager2 = new Villager(true,noble2,squire2,new Tool[] {tool2},true,"Juan","Martínez","de la Cruz",true,setRandomBool(),setRandomBool(),false,false,130.4f,340.7f,0.3f,14,kingdom1,Occupation.VILLAGER,setRandomHealth());
        Villager villager3 = new Villager(false,noble2,new Tool[] {tool1},true,"María","González","de Hernández",false,setRandomBool(),setRandomBool(),false,false,131.8f,312.9f,0.3f,13,kingdom1,Occupation.VILLAGER,setRandomHealth());
            //Jesters
        Jester jester1 = new Jester(true,new String[]{"joke1","joke2"},false,"Pedro","de la Risa","Sandoval",true,setRandomBool(),setRandomBool(),true,false,132.2f,1569.8f,0.3f,17,kingdom1,Occupation.JESTER,setRandomHealth());
        Jester jester2 = new Jester(false,new String[]{"joke1","joke2"}, true,"Luisito","de los Chistes","Romero",true,setRandomBool(),setRandomBool(),false,false,123.8f,1984.9f,0.3f,16,kingdom1,Occupation.JESTER,setRandomHealth());
        Jester jester3 = new Jester(false,new String[]{"joke1","joke2"}, true,"Ramón","de la Alegría","y Morales",true,setRandomBool(),setRandomBool(),false,false,145.8f,1453.9f,0.3f,15,kingdom1,Occupation.JESTER,setRandomHealth());
            //Musicians
        Musician musician1 = new Musician("Tomás","de la Cruz","Villavicencio",true,setRandomBool(),setRandomBool(),true,false,100.7f,224.9f,0.3f,12,kingdom1,Occupation.MUSICIAN,setRandomHealth(),true,new Instrument[]{},false);
        Musician musician2 = new Musician("Ana María","Rivera","Castañeda",false,setRandomBool(),setRandomBool(),false,false,203.9f,245.1f,0.3f,13,kingdom1,Occupation.MUSICIAN,setRandomHealth(),true,new Instrument[]{},true);
        Musician musician3 = new Musician("Francisco","López","Salazar",true,setRandomBool(),setRandomBool(),true,false,99.7f,235.9f,0.3f,11,kingdom1,Occupation.MUSICIAN,setRandomHealth(),false,new Instrument[]{},false);

    }
}
