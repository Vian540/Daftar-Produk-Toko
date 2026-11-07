package kelas.model;
public abstract class Tiket {
 private final String namaPembeli; private int jumlah;
 public Tiket(String nama, int jumlah) {
  if(nama == null || nama.isBlank()) throw new IllegalArgumentException("Nama wajib diisi.");
  if(jumlah <= 0) throw new IllegalArgumentException("Jumlah harus lebih dari nol.");
  this.namaPembeli=nama.trim(); this.jumlah= jumlah;
 }
 public String getNamaPembeli(){return namaPembeli;}
 public int getJumlah(){return jumlah;}
 public void setJumlah(int jumlah){this.jumlah = jumlah;}
 public abstract long hitungTotal();
}
