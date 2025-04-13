package kursusonline.model;

import java.time.LocalDate;

public class Sertifikat {
    private String idSertifikat;
    private String namaKursus;
    private LocalDate tanggalTerbit;

    public Sertifikat(String idSertifikat, String namaKursus, LocalDate tanggalTerbit) {
        this.idSertifikat = idSertifikat;
        this.namaKursus = namaKursus;
        this.tanggalTerbit = tanggalTerbit;
    }

    public String getIdSertifikat() { return idSertifikat; }
    public String getNamaKursus() { return namaKursus; }
    public LocalDate getTanggalTerbit() { return tanggalTerbit; }
}
