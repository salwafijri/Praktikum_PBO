/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan ("Mimi", 3);  // tambah objek
        kucing.suara();    // cetak output dengan panggil method suara()
        kucing.info();    // cetak output dengan panggil method info()
        
        Hewan anjing = new Hewan ("Chase", 5); //constructor 
        anjing.info();  // panggi method info()
        anjing.berlari();  // panggil method berlari()
    }
}
