/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Bagian Hewan
        Kucing kucing = new Kucing();
        kucing.nama = "Lily";
        kucing.jenis = "Persia";
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Dave";
        anjing.jenis = "Bulldog";
        anjing.tampilkanInfo();

        System.out.println("==============================");

        // Bagian Kendaraan
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 170;
        mobil.jumlahRoda = 4;      // dari KendaraanDarat
        mobil.jumlahPintu = 4;     // atribut khusus Mobil

        System.out.println("=== Informasi Mobil (Overriding) ===");
        mobil.tampilkanInfo();

        System.out.println("\n=== Informasi Mobil (Metode Khusus) ===");
        mobil.tampilkanInfoMobil();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;      // dari KendaraanDarat
        motor.jenisMesin = "2-tak"; // atribut khusus SepedaMotor

        System.out.println("=== Informasi Sepeda Motor ===");
        motor.tampilkanInfo();
    }
}