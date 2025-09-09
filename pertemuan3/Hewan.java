/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class Hewan {
    private String nama;    // atribut nama
    private int umur;    // atribut umur
    
    public Hewan(String nama, int umur) {
        this.nama = nama;  //untuk memanggil parameter nama langsung
        this.umur = umur;  //untuk memanggil parameter umur langsung
    }
    public String getNama() {
        return nama;  // untuk mengembalikan nilai nama
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;  // untuk mengembalikan nilai umur
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    void suara() {   // Method
        System.out.println("Hewan Bersuara");
    }
    void info() {  // Method info hewan
        System.out.println("Nama : " + getNama() + ", Umur:" + getUmur());
    }
    void berlari() {  // Method untuk menampilkan output "Hewan sedang berlari"
        System.out.println("Hewan sedang berlari");
    }
}