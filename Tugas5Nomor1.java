/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5nomor1;
import java.util.Scanner;

public class Tugas5Nomor1 {
    public static void main(String[] args) {
        Scanner inputObjk = new Scanner(System.in);
        
        System.out.println("Masukkan nilai N: ");
        int N = inputObjk.nextInt();
        
        int hasil = hitungJumlah(N);
        
        System.out.println("Hasil: ");
        tampilkanDeret(N);
        System.out.println(" = " + hasil);
        
        inputObjk.close();
    }
    public static int hitungJumlah(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void tampilkanDeret(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
    }
    
}
