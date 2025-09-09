/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class MainMobil {
    public static void main(String[] args) {
        // Class Main untuk mobil
        // Membuat object mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Merah");

        // Menampilkan informasi awal
        mobil1.displayInfo();
        mobil2.displayInfo();

        // Menyalakan mesin
        mobil1.startEngine();
        mobil2.startEngine();

        // Mengubah warna mobil
        mobil1.setWarna("Pink");
        System.out.println("\nSetelah warna diubah:");
        mobil1.displayInfo();
    }
}
