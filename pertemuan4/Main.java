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
        Mobil m = new Mobil("Toyota", "Supra", 2021);

        // Akses public
        System.out.println("Tahun: " + m.tahun);

        // Akses private lewat getter
        System.out.println("Merek: " + m.getMerek());

        // Akses protected lewat subclass
        m.tampilkanModel();
        
        // ubah private lewat setter
        m.setMerek("Honda");
        System.out.println("Merek setelah diubah: " + m.getMerek());
    }
}