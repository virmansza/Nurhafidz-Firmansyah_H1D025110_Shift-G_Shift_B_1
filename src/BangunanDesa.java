abstract class BangunanDesa{
    public static final int MAX_TH = 18;
    private final String idBangunan;

    private String nama;
    private int level;

    public BangunanDesa(String idBangunan, String nama){
        this.idBangunan = idBangunan;
        this.nama = nama;
        this.level = 1;
    }

    public BangunanDesa(String idBangunan, String nama, int level){
        this.idBangunan = idBangunan;
        this.nama = nama;
        this.level = level;
    }

    public abstract void upBangunan(int gold, int elixir);

    public void tampilkanInfo(){
        System.out.println("ID " + idBangunan + " | " + nama + " (Level " + level + ")");
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
