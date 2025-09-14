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

    public Mobil(String merek, String model, int tahun) {
        super(merek, model, tahun);
    }

    public void tampilkanModel() {
        // Bisa akses model karena protected
        System.out.println("Model Mobil: " + model);
    }
}