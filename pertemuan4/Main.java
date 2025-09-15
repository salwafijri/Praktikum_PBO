/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari Kendaraan
        Kendaraan kendaraan = new Kendaraan("Kendaraan Umum", 120, "Diesel");
        kendaraan.tampilkanInfoKendaraan();

        System.out.println("\n=== Percobaan Subclass Mobil ===");
        // Membuat objek dari subclass Mobil
        Mobil mbl = new Mobil("Mobil Pribadi", 180, "Solar", 4);
        mbl.tampilkanSpesifikasi();
    }
}