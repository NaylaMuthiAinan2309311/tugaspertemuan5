/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5nomor2;
import java.util.Scanner;

public class Tugas5Nomor2 {
    public static void main(String[] args) {
    Scanner inputObjk = new Scanner(System.in);
        
        System.out.println("Masukkan batas awal: ");
        int batasAwal = inputObjk.nextInt();
        
        System.out.println("Masukkan batas akhir: ");
        int batasAkhir = inputObjk.nextInt();
        
        int jumlahGanjil = hitungBilanganGanjil(batasAwal, batasAkhir);
        
        System.out.println("Jumlah bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " adalah: " + jumlahGanjil);
        
        inputObjk.close();
    }

    public static int hitungBilanganGanjil(int awal, int akhir) {
        int count = 0;
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 != 0) { 
                count++;
            }
        }
        return count;
    }
    
}


