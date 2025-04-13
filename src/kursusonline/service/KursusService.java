package kursusonline.service;

import kursusonline.model.*;

import java.util.ArrayList;

public class KursusService {
    private ArrayList<Kursus> daftarKursus = new ArrayList<>();

    public void tambahKursus(Kursus k) {
        daftarKursus.add(k);
    }

    public void tampilkanSemuaKursus() {
        for (Kursus k : daftarKursus) {
            k.tampilkanDetailKursus();
        }
    }

    public Kursus cariKursusBerdasarkanKode(String kode) {
        for (Kursus k : daftarKursus) {
            if (k.getKode().equals(kode)) {
                return k;
            }
        }
        return null;
    }

    public void tambahPesertaKeKursus(String kodeKursus, Peserta peserta) {
        Kursus kursus = cariKursusBerdasarkanKode(kodeKursus);
        if (kursus != null) {
            kursus.tambahPeserta(peserta);
        } else {
            System.out.println("Kursus dengan kode " + kodeKursus + " tidak ditemukan.");
        }
    }
}
