
package perpus;

import java.util.ArrayList;

public class Siswa {
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa() {
        this.namaSiswa.add("Alfian");
        this.alamat.add("Malang");
        this.telepon.add("081245673214");
        this.status.add(true);
        
        this.namaSiswa.add("Zaki");
        this.alamat.add("Surabaya");
        this.telepon.add("082112345611");
        this.status.add(true);
        
        this.namaSiswa.add("Frandyka");
        this.alamat.add("Madiun");
        this.telepon.add("081234123456");
        this.status.add(true);
    }
    
    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
    
    public void setStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }
    
    public String getStatusKet(int idSiswa) {
        if(this.status.get(idSiswa)) {
            return "Bisa meminjam";
        } else {
            return "Tidak boleh meminjam";
        }
    }
    
    public int getJumlahSiswa() {
        return this.namaSiswa.size();
    }
    
    public void setNama(String siswaNama) {
        this.namaSiswa.add(siswaNama);
    }
    
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }
    
    public void setTelpon(String Telpon) {
        this.telepon.add(Telpon);
    }
    
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }
    
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }
    
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
    
}
