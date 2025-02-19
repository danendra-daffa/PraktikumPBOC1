public class mainTitik{
    public static void main(String[] args) {
       Titik T1 =new Titik(); //membuat objek titik T1 (0,0)
       Titik T2 = new Titik(2,5);
       T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
       T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
       T1.printTitik(); //mencetak kordinat T1 ke layar
       T1.geser(3,4); //menggeser T1 sejauh (3,4)
       T1.printTitik(); //menampilkan kordinat T1 setelah di geser
       //Titik T2 = T1; //
       T2.printTitik();
       T1.setAbsis(7);
       T1.setOrdinat(10);
       T1.printTitik();
       //T2.printTitik();
       

       System.err.println("Jumlah Objek Titik =" + Titik.getCounterTitik());
       //System.err.println("Jumlah Objek Titik =" + T2.getCounterTitik());
    }
}