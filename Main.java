package perpus;

public class Main {

    public static void main(String[] args) {
        Buku buku = new Buku();
        Siswa siswa = new Siswa();
        Peminjam peminjaman = new Peminjam();
        Laporan laporan = new Laporan();

        System.out.println("================================");
        laporan.laporan(buku);
        System.out.println("================================");
        laporan.laporan(siswa);
        laporan.halo(siswa, buku);
    }

}
