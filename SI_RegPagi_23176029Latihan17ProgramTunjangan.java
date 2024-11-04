/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_23176029latihan17programtunjangan;

/**
 *
 * @author shafi
 * Nama  : Shafitri Salma Ramadanti
 * NIM   : 23176029
 * Kelas : PBO1
 * Prodi : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan program tunjangan
 */
import java.util.Scanner;
public class SI_RegPagi_23176029Latihan17ProgramTunjangan {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("=====Program Tunjangan=====");
        System.out.print("Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.next();

        double tunjangan = 0;

        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Nama  : " + nama);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Total Gaji  : Rp " + totalGaji);
       
        scanner.close();
    }
    
}
