package kelas.model;
public class TiketReguler extends Tiket {
    private long totalCounter = 1;
 public TiketReguler(String nama,int jumlah){super(nama,jumlah);}
 public void setTotalCounter(long totalCounter){
     this.totalCounter = totalCounter;
 }
 @Override public long hitungTotal(){return totalCounter;}
}
