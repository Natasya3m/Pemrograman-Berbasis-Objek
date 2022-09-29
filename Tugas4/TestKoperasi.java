/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 9000000);
        
        System.out.println("Nama Anggota: " + donny.getName());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang: ");
        int pinjam  = ip.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran: ");
        int angsur = ip.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
