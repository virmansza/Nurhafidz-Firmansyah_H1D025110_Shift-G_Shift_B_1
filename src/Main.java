public class Main {
    public static void main(String[] args){
        System.out.println("=== WELCOME TO CLASH OF CLANS===\n");
        TownHall TH = new TownHall("TH-1", "TownHall", 1);
        StrukturPertahanan cannon = new StrukturPertahanan("DEF-1", "Cannon",2, 300 );

        TH.tampilkanInfo();
        cannon.tampilkanInfo();
        System.out.println("-----------------------------");

        TH.upBangunan(600000000,60000000);
        TH.tampilkanInfo();


        cannon.upBangunan(10000000,6000000);
        cannon.claimResource();

        System.out.println("-----------------------------");

        Pertahanan senjatadesa = new StrukturPertahanan("DEF-02", "Mortar", 1, 150);
        senjatadesa.serangMusuh();
        cannon.serangMusuh();
    }
}
