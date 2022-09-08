/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Praktikum1_No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim[] = {2,1,4,1,7,6,2,1,0,9};
        
        System.out.println("Masukkan tinggi = ");
        int tinggi = sc.nextInt();
        int t = 0;
        int s = t;
    do{
        System.out.println();
        do{
            System.out.println();
        t++;
        }while (t < tinggi);
        s++;
    }while (s < tinggi);
           
    int b = 0;
    do{
        System.out.println(nim[b]);
        b++;
    }while (b <= (s*2)-1);
        System.out.println();
    }
}
