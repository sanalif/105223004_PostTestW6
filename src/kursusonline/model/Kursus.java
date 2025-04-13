package kursusonline.model;

import java.util.ArrayList;

public class Kursus {
    private String kode;
    private String nama;
    private Instruktur instruktur;
    private ArrayList<Peserta> daftarPeserta = new ArrayList<>();
    private ArrayList<Materi> daftarMateri = new ArrayList<>();

    public Kursus(String kode, String nama, Instruktur instruktur) {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }

    public void tambahMateri(Materi m) {
        daftarMateri.add(m);
    }

    public void tambahPeserta(Peserta p) {
        if (!p.getEmail().endsWith("@gmail.com")) {
            System.out.println("Email tidak valid: " + p.getEmail());
            return;
        }
        for (Peserta peserta : daftarPeserta) {
            if (peserta.getId().equals(p.getId())) {
                System.out.println("Peserta dengan ID " + p.getId() + " sudah terdaftar.");
                return;
            }
        }
        daftarPeserta.add(p);
    }

    public void tampilkanDetailKursus() {
        System.out.println("=========================================");
        System.out.println("Kode Kursus   : " + kode);
        System.out.println("Nama Kursus   : " + nama);
        System.out.println("Instruktur    : " + instruktur.getNama() + " (" + instruktur.getSpesialisasi() + ")");
    
        System.out.println("\nDaftar Materi:");
        if (daftarMateri.isEmpty()) {
            System.out.println("  - Belum ada materi.");
        } else {
            for (int i = 0; i < daftarMateri.size(); i++) {
                Materi m = daftarMateri.get(i);
                System.out.println("  " + (i + 1) + ". Judul     : " + m.getJudul());
                System.out.println("     Deskripsi : " + m.getDeskripsi());
                System.out.println("     Durasi    : " + m.getDurasi() + " menit");
            }
        }
    
        System.out.println("\nDaftar Peserta:");
        if (daftarPeserta.isEmpty()) {
            System.out.println("  - Belum ada peserta.");
        } else {
            for (int i = 0; i < daftarPeserta.size(); i++) {
                Peserta p = daftarPeserta.get(i);
                System.out.println("  " + (i + 1) + ". ID       : " + p.getId());
                System.out.println("     Nama     : " + p.getNama());
                System.out.println("     Email    : " + p.getEmail());
                System.out.println("     No. HP   : " + p.getNoHp());
            }
        }
    
        System.out.println("=========================================\n");
    }
    
    
}
