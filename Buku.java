package perpus;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku() {
        this.namaBuku.add("Tentang Kamu");
        this.stok.add(10);
        this.harga.add(10000);
        
        this.namaBuku.add("Pulang Pergi");
        this.stok.add(15);
        this.harga.add(50000);
        
        this.namaBuku.add("Selamat Tinggal");
        this.stok.add(20);
        this.harga.add(100000);
    }
    
    public int getJumlahBuku() {
        return this.namaBuku.size();
    }
    
    public void setnamaBuku(String bukuNama) {
        this.namaBuku.add(bukuNama);
    }
    
    public String getnamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }
    
    public void setStok(int stok) {
        this.stok.add(stok);
    }
    
    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }
    
    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);
    }
    
    public void setHarga(int harga) {
        this.harga.add(harga);
    }
    
    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
}

