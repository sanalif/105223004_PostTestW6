import kursusonline.model.*;
import kursusonline.service.KursusService;

//import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Instruktur
        Instruktur i1 = new Instruktur("I001", "Budi", "Java");
        Instruktur i2 = new Instruktur("I002", "Siti", "Web Development");

        // Kursus
        Kursus k1 = new Kursus("K001", "Java Dasar", i1);
        Kursus k2 = new Kursus("K002", "Web Design", i2);

        // Materi
        Materi m1 = new Materi("Pengenalan Java", "Dasar-dasar Java", 60);
        Materi m2 = new Materi("OOP", "Konsep OOP di Java", 90);
        Materi m3 = new Materi("HTML & CSS", "Dasar Web", 45);

        k1.tambahMateri(m1);
        k1.tambahMateri(m2);
        k2.tambahMateri(m3);

        // Peserta
        Peserta p1 = new Peserta("P001", "Ali", "ali@gmail.com", "081234567890");
        Peserta p2 = new Peserta("P002", "Ayu", "ayu@yahoo.com", "081234567891"); // Invalid email
        Peserta p3 = new Peserta("P003", "Rina", "rina@gmail.com", "081234567892");

        // Service
        KursusService service = new KursusService();
        service.tambahKursus(k1);
        service.tambahKursus(k2);

        service.tambahPesertaKeKursus("K001", p1);
        service.tambahPesertaKeKursus("K001", p2); // Invalid
        service.tambahPesertaKeKursus("K001", p3);

        // Tampilkan Semua Kursus
        service.tampilkanSemuaKursus();
    }
}
