/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Praktikum1_No2 {
    public static void main(String[] args) {
        int nim[] = {2,1,4,1,7,6,2,1,0,9};
        int total = 0;
        
        for(int i=0; i < nim.length; i++){
            System.out.print(nim[i] + "+");
            total += nim[i];
        }
        System.out.println();
        System.out.println("HASIL = " + total);
    }
}
