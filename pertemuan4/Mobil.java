/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanSpesifikasi() {
        // nama bersifat private → akses lewat getter
        System.out.println("Nama Kendaraan: " + getNama());
        // kecepatanMaks bersifat protected → bisa diakses langsung oleh subclass
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        // jenisMesin bersifat public → bisa diakses langsung
        System.out.println("Jenis Mesin: " + jenisMesin);
        // tambahan atribut subclass
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}