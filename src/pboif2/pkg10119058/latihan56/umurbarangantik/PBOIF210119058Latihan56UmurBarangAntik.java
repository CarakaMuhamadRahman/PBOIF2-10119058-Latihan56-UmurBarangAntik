/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan56.umurbarangantik;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program :Program ini berisi program untuk menampilkan umur barang 
 *                    antik.
 */
public class PBOIF210119058Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234); 
        radio.setName("Radio AM");    
        
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
