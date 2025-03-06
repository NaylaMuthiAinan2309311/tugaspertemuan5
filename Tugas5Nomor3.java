/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5nomor3;
import java.util.Scanner;

public class Tugas5Nomor3 {
    public static void main(String[] args) {  
        Scanner inputObjk = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = inputObjk.nextInt();
        
        int hasil = hitungFaktorial(n);
        
        System.out.print(n + "! = ");
        tampilkanFaktorial(n);
        System.out.println(" = " + hasil);
        
        inputObjk.close();
    }
    public static int hitungFaktorial(int n) {
        int faktorial = 1;
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
        }
        return faktorial;
    }
    public static void tampilkanFaktorial(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
    }
    
}
