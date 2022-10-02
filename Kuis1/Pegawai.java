/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Asus
 */
public class Pegawai {
    private String nama, NIP;
    private double gajiPokok, lembur, uangMakan, transport, totalGaji;
    private int jumlahJamKerja, jamKerja;

    public int getJamKerja(){
        return jumlahJamKerja;
    }
    
    public void setJamKerja(int newjmlJamKerja){
        jumlahJamKerja = newjmlJamKerja;
    }
    
    public Pegawai(String nama, String NIP, int jamKerja){
        this.nama = nama;
        this.NIP = NIP;
        this.jamKerja = jamKerja;
    }
    
    public void hitungGajiHarian(){
        if(jamKerja <= 7){
            gajiPokok = jamKerja * 2000;
        }
        else if(jamKerja > 7 && jamKerja == 8){
            gajiPokok = jamKerja * 2000;
            lembur = ((jamKerja - 7) * 1.5) * 2000;
        }
        else if(jamKerja >= 8 && jamKerja == 9){
            gajiPokok = jamKerja * 2000;
            lembur = ((jamKerja - 7) * 1.5) * 2000;
            uangMakan = 3500;
        }
        else if(jamKerja >=9){
            gajiPokok = jamKerja * 2000;
            lembur = ((jamKerja - 7) * 1.5) * 2000;
            uangMakan = 3500;
            transport = 4000;
        }
        else{
            System.out.println("Input yang dimasukkan salah!");
        }
        
        totalGaji = gajiPokok + lembur + uangMakan + transport;
    }
    
    public void cetakPeghasilan(){
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("\nJumlah jam kerja : " + jamKerja + " jam");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Lembur : " + lembur);
        System.out.println("Uang Makan : " + this.uangMakan);
        System.out.println("Transport : " + this.transport);
        System.out.println("Total Gaji : " + totalGaji);
        System.out.println("\n");
    }
}
