/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Asus
 */
public class Anggota {
    private String number, name;
    private int limit, pinjam, angsur;

    Anggota(String number, String name, int limit) {
        this.number = number;
        this.name = name;
        this.limit = limit;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String newNumber){
        number = newNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getLimitPinjaman(){
        if(limit > 8000000){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
        else{
            System.out.println(" ");
        }
        return limit;
    }
    
    public int getJumlahPinjaman(){
        return pinjam;
    }
    
    public void pinjam(float uang){
        pinjam += uang;
    }
    
    public void angsur(float uang){
        if(uang <= pinjam * 10/100){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else{
            pinjam -= uang;
        }
    }

}
