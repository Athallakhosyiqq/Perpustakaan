package perpus;

import java.util.ArrayList;

class Peminjam {
    

public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Peminjaman() {
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }
}
}


