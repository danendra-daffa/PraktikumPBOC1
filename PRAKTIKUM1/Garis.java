    /*
    Nama File   :   Garis.java
    Deskripsi   :   Berisi atribut dan metode dalam kelas Garis
    Pembuat     :   Muhammad danendra daffa
    Tanggal     :   21/02/2025
    */
    
public class Garis {
    /************** Atribut ***************/  
    private Titik titikA;
    private Titik titikB;
    private static int jumlahGaris = 0;
    
    /*************** Metode ***********/
    // Konstruktor default
    public Garis(){
        titikA = new Titik();
        titikB = new Titik(1,1);
        jumlahGaris++;
    }
    
    // Konstruktor dengan parameter
    public Garis(double x1, double y1, double x2, double y2){
        titikA = new Titik(x1, y1);
        titikB = new Titik(x2, y2);
        jumlahGaris++;
    }
    
    // Mengembalikan titik pertama
    public Titik getTitikA() {
        return titikA;
    }
    
    // Mengembalikan titik kedua
    public Titik getTitikB() {
        return titikB;
    }
    
    // Mengembalikan jumlah garis yang telah dibuat
    public static int getJumlahGaris() {
        return jumlahGaris;
    }
    
    // Mengatur nilai titik pertama
    public void setTitikA(double x, double y) {
        titikA.setAbsis(x);
        titikA.setOrdinat(y);
    }
    
    // Mengatur nilai titik kedua
    public void setTitikB(double x, double y) {
        titikB.setAbsis(x);
        titikB.setOrdinat(y);
    }
    
    // Menghitung panjang garis
    public double getPanjangGaris(){
        return Math.sqrt(Math.pow(titikA.getAbsis() - titikB.getAbsis(), 2) +
                         Math.pow(titikA.getOrdinat() - titikB.getOrdinat(), 2));
    }
    
    // Menghitung gradien garis
    public double getGradienGaris(){
        return (titikB.getOrdinat() - titikA.getOrdinat()) / (titikB.getAbsis() - titikA.getAbsis());
    }
    
    // Mengembalikan titik tengah garis
    public Titik getTitikTengah(){
        double tengahX = (titikA.getAbsis() + titikB.getAbsis()) / 2;
        double tengahY = (titikA.getOrdinat() + titikB.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }
    
    // Mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis g){
        return getGradienGaris() == g.getGradienGaris();
    }
    
    // Mengecek apakah dua garis tegak lurus
    public boolean isTegakLurus(Garis g){
        return getGradienGaris() * g.getGradienGaris() == -1;
    }
    
    // Menampilkan koordinat titik awal dan akhir
    public void cetakGaris(){
        System.out.println("Titik Awal: (" + titikA.getAbsis() + ", " + titikA.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikB.getAbsis() + ", " + titikB.getOrdinat() + ")");
    }
    
    // Menampilkan persamaan garis dalam bentuk y = mx + c
    public void cetakPersamaanGaris(){
        double c = titikA.getOrdinat() - (getGradienGaris() * titikA.getAbsis());
        System.out.println("y = " + getGradienGaris() + "x + " + c);
    }
}
