/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class MainManusia {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja p1 = new Pekerja("Roy", 25, "Programmer", 7500000);

        // Menampilkan data pekerja dengan toString()
        System.out.println("Data Pekerja:");
        System.out.println(p1.toString());

        // Mengubah nama menggunakan setter
        p1.setNama("Beni");
        System.out.println("\nSetelah nama diubah:");
        System.out.println(p1.toString());

        // Simulasi akses langsung atribut
        System.out.println("\nSimulasi Akses Langsung:");
        
        // Usia (protected) -> bisa diakses karena Main ada di package yang sama
        System.out.println("Usia langsung: " + p1.usia);

        // Pekerjaan (public) -> bisa diakses dari mana saja
        System.out.println("Pekerjaan langsung: " + p1.pekerjaan);
    }
}