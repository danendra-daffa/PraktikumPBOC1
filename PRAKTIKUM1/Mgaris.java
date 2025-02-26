/*
Nama File   :   Mgaris.java
Deskripsi   :   Main Garis
Pembuat     :   Muhammad danendra daffa
Tanggal     :   21/02/2025
*/

public class Mgaris {
    public static void main(String[] args) {
        System.out.println("Inisialisasi G1");
        Garis g1 = new Garis();
        g1.cetakGaris();
        System.out.println("Inisialisasi G2");
        Garis g2 = new Garis(2, 4, 3, 3);
        g2.cetakGaris();
        System.out.println("*********************** Getter ****************");
        System.out.println("Titik awal G1: " + g1.getTitikA().getAbsis() + ", " + g1.getTitikA().getOrdinat());
        System.out.println("Titik akhir G1: " + g1.getTitikB().getAbsis() + ", " + g1.getTitikB().getOrdinat());
        System.out.println("*********************** Counter Garis **********************");
        System.out.println("Jumlah garis: " + Garis.getJumlahGaris());
        System.out.println("*********************** Setter *******************");
        g1.setTitikA(2, 3);
        g1.setTitikB(8, 4);
        System.out.println("G1 setelah diubah:");
        g1.cetakGaris();
        System.out.println("*********************** Panjang Garis *******************");
        System.out.println("Panjang G1: " + g1.getPanjangGaris());
        System.out.println("*********************** Gradien *******************");
        System.out.println("Gradien G1: " + g1.getGradienGaris());
        System.out.println("*********************** Titik Tengah *******************");
        Titik titikTengahG2 = g2.getTitikTengah();
        titikTengahG2.cetakTitik();
        System.out.println("*********************** Sejajar *******************");
        boolean sejajar = g1.isSejajar(g2);
        System.out.println("Apakah sejajar? " + sejajar);
        System.out.println("*********************** Tegak Lurus *******************");
        boolean tegakLurus = g1.isTegakLurus(g2);
        System.out.println("Apakah tegak lurus? " + tegakLurus);
        System.out.println("*********************** Print Garis *******************");
        g1.cetakGaris();
        System.out.println("*********************** Print Persamaan *******************"
        g1.cetakPersamaanGaris();
    }
}
