public class StrukturPertahanan  extends BangunanDesa implements  Konstruksi, Pertahanan{
    private int damage;

    public StrukturPertahanan(String id, String nama, int level, int damage){
        super(id, nama, level);
        this.damage = damage;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Damage: " + damage);
    }

    @Override
    public void claimResource(){
        System.out.println(getNama() + " tidak mengumpulkan resource, fokus berjaga.");
    }

    @Override
    public void serangMusuh(){
        System.out.println(getNama() + " Mendeteksi musuh! Menyerang dengan damage " + damage + "!" );
    }

    @Override
    public void upBangunan(int gold, int elixir){
        System.out.println("\n Memeriksa resource untuk upgrade pertahanan...");
        if (gold >= 300000){
            setLevel(getLevel()+1);
            this.damage += 25;
            System.out.println("Sukses! " + getNama() + " naik ke level " + getLevel() + ". Damage menjadi " + damage);
        } else {
            System.out.println("Gagal: Butuh minimal 3 Juta Gold untuk upgrade defense kamu.");
        }
    }
}
