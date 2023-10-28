/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan24Perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * perbandingan dua buah nilai yang inputannya berasal dari user
 * 
 */
public class TIRegPagi22205009latihan24Perbandinganduabuahnilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Perbandingan Nilai======");

        boolean ulangi = true;

        while (ulangi) {
            System.out.print("Masukkan nilai pertama\t: ");
            int nilaiPertama = scanner.nextInt();
            System.out.print("Masukkan nilai kedua\t: ");
            int nilaiKedua = scanner.nextInt();
            System.out.print("Hasil : ");
            if (nilaiPertama > nilaiKedua) {
                System.out.println(nilaiPertama + " lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else if (nilaiPertama == nilaiKedua) {
                System.out.println(nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("\nUlangi Aktifitas ? (Ya/Tidak): ");
            String ulangiAktifitas = scanner.next();
            if (ulangiAktifitas.equals("Ya")) {
                System.out.println("");
            } else if (ulangiAktifitas.equals("Tidak")) {
                System.out.println("Program berhasil berhenti");
                ulangi = false;
            } 
            
        }
    }
}
