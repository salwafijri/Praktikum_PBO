/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    // Atribut
    private String merek;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merek, String model, int tahun, String warna) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter dan Setter
    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method untuk tampilkan output
    public void displayInfo(){
        System.out.println("Merek  : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
        System.out.println("------------------------");
    }

    public void startEngine() {
        System.out.println("Engine Start! tidin... tidin... tidin...");
        System.out.println("Mesin mobil " + merek + " menyala.");
        System.out.println("-------------------------------------------");
    }
}
