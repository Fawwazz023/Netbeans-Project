/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mfawwazafifqinthoro;
import model.aplikasiAR;
import model.komponenAplikasi;
import model.perbandinganMedia;
import frame.FrameApp;

/**
 *
 * @author User
 */
public class MFawwazAfifQinthoro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameApp frame = new FrameApp();
        frame.setVisible(true);
        
        System.out.println("\n==== Data Aplikasi AR ====");
        aplikasiAR ar = new aplikasiAR();
        ar.setIdPromosi("P001");
        ar.setNamaPromosi("Sky Tower");
        ar.setJenisPromosi("AR");
        ar.setTargetAudiens("Milenial");
        ar.setBiayaPromosi(8000000);
        ar.setDurasiPromosi("1 Bulan");
        ar.setNamaAplikasi("ARView360");
        ar.setVersi("1.0");
        ar.setPlatform("Android");
        ar.setFiturUtama("Simulasi Virtual");
        ar.setPengembang("PT ARInovasi");
        System.out.println(ar.infoAplikasiAR());
        
        System.out.println("\n==== Data Komponen Aplikasi ====");
        komponenAplikasi komponen = new komponenAplikasi();
        komponen.setIdPromosi("P001");
        komponen.setNamaPromosi("Sky Tower");
        komponen.setJenisPromosi("AR");
        komponen.setTargetAudiens("Milenial");
        komponen.setBiayaPromosi(8000000);
        komponen.setDurasiPromosi("1 Bulan");
        komponen.setNamaKomponen("Kamera");
        komponen.setFungsi("Menampilkan 3D objek");
        System.out.println(komponen.infoKomponenAplikasi());

        System.out.println("\n==== Data Perbandingan Media ====");
        perbandinganMedia banding = new perbandinganMedia();
        banding.setIdPromosi("P001");
        banding.setNamaPromosi("Sky Tower");
        banding.setJenisPromosi("Campuran");
        banding.setTargetAudiens("Milenial");
        banding.setBiayaPromosi(6000000);
        banding.setDurasiPromosi("1.5 Bulan");
        banding.setAspek("Interaktivitas");
        banding.setNilaiTradisional("Gambar Statis");
        banding.setNilaiAR("AR Dinamis");
        banding.setKesimpulan("AR lebih menarik dan efektif");
        System.out.println(banding.infoPerbandinganMedia());
    }
    
}
