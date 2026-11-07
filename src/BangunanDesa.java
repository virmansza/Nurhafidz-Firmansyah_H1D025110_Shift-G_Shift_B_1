abstract class Bangunan {
    public static final int MAX_TH = 18;
    private final String idTH;

    private String nama;
    private int level;

    public TownHall(String idTH, String nama){
        this.idTH = idTH;
        this.nama = nama;
        this.level = 1;
    }

    public TownHall(String idTH, String nama, int level){
        this.idTH = idTH;
        this.nama = nama;
        this.level = level;
    }

    public abstract void upTownHall(int gold, int elixir);

    public void tampilkanInfo(){
        System.out.println("ID " + idTH + " | " + nama + " (Level " + level + ")");
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public String getNama(){
        return nama;
    }
}
