/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas.model;

/**
 *
 * @author Favian R.H
 */
public class Produk {
    private final String nama;
    private final int harga;
    private final String jenis;
    
    public Produk(String nama, int harga, String jenis){
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String getJenis(){
        if(jenis.equals("Makanan")){
            return "Minuman";
        }
        else{
            return "Makanan";
        }
    }
}
