public class MainFile {
    public static void main(String[] args) {
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
        Noble noble1 = new Noble("Don Juan","de Habsburgo","Rivera",true,false,true,false,true,789.5f,8941.3f,0.15f,22,kingdom1,Occupation.NOBLE,HealthState.HEALTHY,5,true, royalGuard1);
        Noble noble2 = new Noble("Don Pedro","de la Vega","y Cortés",true,false,true,false,true,789.5f,8941.3f,0.15f,22,kingdom1,Occupation.NOBLE,HealthState.HEALTHY,5,true, royalGuard2);
        UpperClass count1 = new UpperClass("Don Fernando","Silva","Jimenez",true,true,false,false,true,741.8f,9632.4f,0.15f,20,kingdom1,Occupation.COUNT,HealthState.HEALTHY,3);
        UpperClass count2 = new UpperClass("Doña Beatriz","de Silva","Villalobos",false,true,false,false,true,541.8f,9632.4f,0.15f,20,kingdom1,Occupation.COUNT,HealthState.HEALTHY,3);
        UpperClass baron1 = new UpperClass("Don Luis","Castilla","Linares",true,false,true,false,true,852.1f,621.2f,0.15f,21,kingdom1,Occupation.BARON,HealthState.PLAGUED,2);
        UpperClass baron2 = new UpperClass("Doña Ana","de Castilla","Cuevas",false,true,true,false,true,852.1f,621.2f,0.15f,21,kingdom1,Occupation.BARON,HealthState.PLAGUED,2);
        UpperClass duke1 = new UpperClass("Don Miguel","Borbón","y Valois",true,true,false,false,true,741.9f,8921.8f,0.15f,18,kingdom1,Occupation.DUKE,HealthState.HEALTHY,1);
        UpperClass duke2 = new UpperClass("Doña Esmeralda","de Borbón","Mendoza",false,true,false,false,true,741.9f,8921.8f,0.15f,18,kingdom1,Occupation.DUKE,HealthState.HEALTHY,1);
        //Lower Class
            //Villagers
        Villager villager1 = new Villager(false,noble1,squire1,new Tool[] {tool1},true,"Éder","Muñóz","Castro",true,false,false,false,false,126.8f,382.9f,0.3f,12,kingdom1,Occupation.VILLAGER,HealthState.HEALTHY);
        Villager villager2 = new Villager(true,noble2,squire2,new Tool[] {tool2},true,"Juan","Martínez","de la Cruz",true,true,false,false,false,130.4f,340.7f,0.3f,14,kingdom1,Occupation.VILLAGER,HealthState.PLAGUED);
        Villager villager3 = new Villager(false,noble2,new Tool[] {tool1},true,"María","González","de Hernández",false,false,false,false,false,131.8f,312.9f,0.3f,13,kingdom1,Occupation.VILLAGER,HealthState.HEALTHY);
            //Jesters
        Jester jester1 = new Jester(true,new String[]{"joke1","joke2"},false,"Pedro","de la Risa","Sandoval",true,true,false,true,false,132.2f,1569.8f,0.3f,17,kingdom1,Occupation.JESTER,HealthState.PLAGUED);
        Jester jester2 = new Jester(false,new String[]{"joke1","joke2"}, true,"Luisito","de los Chistes","Romero",true,false,true,false,false,123.8f,1984.9f,0.3f,16,kingdom1,Occupation.JESTER,HealthState.HEALTHY);
        Jester jester3 = new Jester(false,new String[]{"joke1","joke2"}, true,"Ramón","de la Alegría","y Morales",true,false,true,false,false,145.8f,1453.9f,0.3f,15,kingdom1,Occupation.JESTER,HealthState.HEALTHY);
            //Musicians
        Musician musician1 = new Musician("Tomás","de la Cruz","Villavicencio",true,false,true,true,false,100.7f,224.9f,0.3f,12,kingdom1,Occupation.MUSICIAN,HealthState.HEALTHY,false,new Instrument[]{},false);
        Musician musician2 = new Musician("Ana María","Rivera","Castañeda",false,false,false,false,false,203.9f,245.1f,0.3f,13,kingdom1,Occupation.MUSICIAN,HealthState.PLAGUED,false,new Instrument[]{},true);
        Musician musician3 = new Musician("Francisco","López","Salazar",true,false,true,true,false,99.7f,235.9f,0.3f,11,kingdom1,Occupation.MUSICIAN,HealthState.HEALTHY,false,new Instrument[]{},false);

        instrument1.play();
    }
}
