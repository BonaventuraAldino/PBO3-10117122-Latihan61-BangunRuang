/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan61.bangunruang;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program :  Program ini berisi program untuk menghitung volume 
 *                      bangun ruang bola, tabung, dan kerucut, dan menampilkan
 *                      kelayar menggunakan pendekatan berbasis objek.
 */
public class PBO310117122Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.setJariJari(7);
        bola.setPhi(3.14);
        System.out.println("Jari-jari dari sebuah bola basket adalah " 
                + bola.getJariJari());
        System.out.println("Maka, Volume Bola = " + bola.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setPhi(3.14);
        tabung.setTinggi(21);
        System.out.println("\nSebuah tabung memiliki jari-jari " + 
                tabung.getJariJari() + " cm. Jika tingginya " + 
                tabung.getTinggi() + " cm.");
        System.out.println("Maka, Volume Tabung = " + tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        kerucut.setPhi(3.14);
        System.out.println("\nDiketahui tinggi sebuah kerucut " +
                kerucut.getTinggi() + " cm." + " Jika jari-jarinya " + 
                kerucut.getJariJari());
        System.out.println("Maka, Volume Kerucut = " + kerucut.hitungVolume());
        System.out.println("\n(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
