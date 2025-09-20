/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO
 */
public class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void tampilkanInfoMobil() {
        System.out.println("Nama Mobil: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}