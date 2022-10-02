/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Asus
 */
public class PegawaiMain {
    public static void main(String[] args) {
        Pegawai nt = new Pegawai("Natasya", "213", 4);
        Pegawai ntt = new Pegawai("Tri", "214", 9);
        Pegawai nttt = new Pegawai("Melinna", "215", 10);
        
        System.out.println("----------------------------------------------");
        System.out.println("---------------- GAJI HARIAN -----------------");
        System.out.println("=================== PT. XYZ ==================");
        nt.hitungGajiHarian();
        nt.cetakPeghasilan();
        
        ntt.hitungGajiHarian();
        ntt.cetakPeghasilan();
        
        nttt.hitungGajiHarian();
        nttt.cetakPeghasilan(); 
    }
}
