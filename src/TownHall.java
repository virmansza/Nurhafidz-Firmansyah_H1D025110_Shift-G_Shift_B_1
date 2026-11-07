public class TownHall extends BangunanDesa implements Konstruksi{
    private boolean statusUpgrage;

    public TownHall(String id, String nama, int level){
        super(id, nama, level);
        this.statusUpgrage = false;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status Builder: " + (statusUpgrage ? "Sibuk Upgrade" : "Tersedia"));
    }

    @Override
    public void claimResource() {
        System.out.println(getNama() + " mengumpulkan Gold dan Elixir desa.");
    }
    @Override
    public void upBangunan(int gold, int elixir) {
        System.out.println("\n Upgrade " + getNama() + " dari Level " + getLevel() + "...");

        if (getLevel() >= MAX_TH){
            System.out.println("TownHall sudah mencapai level maksimal (" + MAX_TH +")!");
        } else if(gold >= 5000000 && elixir >= 5000000){
            System.out.println("Upgrade berjalan! Menuju level: " + (getLevel()+1) + ".");
            setLevel(getLevel() + 1);
            this.statusUpgrage = true;
        } else {
            System.out.println("Sumber daya tidak cukup untuk Upgrade!");
        }

    }
}
