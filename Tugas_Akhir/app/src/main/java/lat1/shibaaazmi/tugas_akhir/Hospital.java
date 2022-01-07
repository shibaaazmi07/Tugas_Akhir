package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Hospital extends AppCompatActivity {

    private ArrayList<Integer> gambar_rs= new ArrayList<>();
    private ArrayList<String>nama_rs= new ArrayList<>();
    private ArrayList<String> tv_website= new ArrayList<>();
    private ArrayList<String>wilayah_rs= new ArrayList<>();
    private ArrayList<String> detail_rs= new ArrayList<>();
    private ArrayList<String> tv_alamatRS= new ArrayList<>();
    RecyclerView recyclerView;
    rvAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        recyclerView= findViewById(R.id.rvRS);
        adapter= new rvAdapter(gambar_rs,nama_rs,tv_website,wilayah_rs,detail_rs,tv_alamatRS,this);
        recyclerView.setAdapter(adapter);
        getData();



    }

    public void prosesrvAdapter(){
        RecyclerView recyclerView= findViewById(R.id.rvRS);
        rvAdapter adapter= new rvAdapter(gambar_rs,nama_rs,tv_website,wilayah_rs,detail_rs,tv_alamatRS,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem item= menu.findItem(R.id.aksi_pencarian);
        SearchView searchView= (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    private void getData() {
        gambar_rs.add(R.drawable.rs1kariadi);
        nama_rs.add("RS Umum Pusat Dr. Kariadi");
        tv_website.add("https://www.rskariadi.co.id/");
        wilayah_rs.add("Semarang");
        detail_rs.add("RSUP Dr. Kariadi adalah Satuan Kerja/ Unit Pelaksana Teknis yang berada di bawah dan bertanggungjawab kepada Direktur Jenderal Pelayanan Kesehatan Kementerian Kesehatan RI. Berdasarkan SK Menkes No. 1243/Menkes/SK/VIII/2005 telah ditetapkan menjadi Badan Layanan Umum (BLU), dengan menerapkan fleksibilitas pengelolaan keuangan sesuai dengan " +
                "yang telah diamanatkan dalam PP No.23 Tahun 2005. RSUP Dr. Kariadi Semarang merupakan Rumah Sakit terbesar sekaligus berfungsi sebagai Rumah Sakit rujukan bagi wilayah Jawa Tengah.Vaksin RSUP Dr Kariadi Semarang merupakan sistem yang dibuat untuk masyarakat yang mendapatkan dosis vaksinasi COVID-19 dan dapat melakukan pendaftaran vaksinasi di RSUP Dr Kariadi Semarang" +
                "Setelah melakukan reservasi akan mendapatkan kode reservasi yang akan ditunjukkan saat akan melakukan vaksinasi di hari dan jam yang sudah ditentukan. Jarak vaksin pertama dan vaksin kedua adalah 28 (dua puluh delapan) hari." +
                "beberapa informasi penting yang akan diperloleh:\n a. Bukti pendaftaran\n" +
                "b. Jadwal Vaksin Pertama\n" +
                "c. Jadwal Vaksin Kedua (jika vaksin pertama telah dilakukan)\n" +
                "d. Untuk peserta vaksin yang jadwal vaksin kedua 14 (empat belas) hari berubah menjadi 28 (dua puluh delapan) hari");
        tv_alamatRS.add("Alamat : Jl. DR. Sutomo No.16, Randusari, Kec. Semarang Sel., Kota Semarang");

        gambar_rs.add(R.drawable.rs2rsudbanyumas);
        nama_rs.add("RSUD BANYUMAS");
        tv_website.add("https://www.rsudbanyumas.my.id/");
        wilayah_rs.add("Banyumas");
        detail_rs.add("Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan." +
                "Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, \n" +
                "terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan.\n" +
                "RSUD Banyumas adalah rumah sakit tipe B Pendidikan milik Pemerintah Daerah Kabupaten Banyumas yang berdasarkan Keputusan Bupati Banyumas nomor 445/371/2008 tanggal 16 Juli 2008  tentang Penetapan Penerapan Pola Pengelolaan Keuangan Badan Layanan Umum daerah (PPK-BLUD) kepada RSUD Banyumas" +
                "RSUD Banyumas menyelenggarakan kegiatan pelayanan jasa kesehatan, pendidikan, pelatihan, penelitian dan pengembangan kesehatan. Sifat kegiatan tersebut berfungsi sosial, profesional, dan etis dengan pengelolaan keuangan berdasarkan prinsip ekonomi dan menerapkan praktik bisnis yang sehat. Pelayanan RSUD Banyumas saat ini adalah IGD, Poliklinik Rawat Jalan, Pelayanan Rawat Inap, Bedah Sentral, ICU, Penunjang (Laborat, Radiologi, Rehabilitasi Medis,Pendidikan dan Pelatihan, Gizi, sampai dengan Pemulasaraan Jenazah."
        );
        tv_alamatRS.add("Alamat: Jl. Rumah Sakit No.1, Karangpucung, Kejawar, Kec. Banyumas, Kabupaten Banyumas");

        gambar_rs.add(R.drawable.rs3rsudsoewondo);
        nama_rs.add("RS Umum Daerah Dr. H. Soewondo");
        tv_website.add("https://rsudkendal.kendalkab.go.id/");
        wilayah_rs.add("Kendal");
        detail_rs.add("Nama  RSUD\t\t: RSUD Dr H SoewondoKabupaten Kendal\n" +
                "Type\t\t\t: B (SK : YT.01.10/III/3140/09 )\n" +
                "LULUS  ISO  9001-2008\t: No Sertifikat QSC 00830  01 JUNI  2013 (Instalasi Gawat Darurat dan Seksi admisi Rekam Medik)\n" +
                "Penghargaan\t\t: Citra Pelayanan Prima  Tingkat Pratama thn 2010 dari menteri negara pendayagunaan aparatur  negara dan reformasi birokrasi\n" +
                "Direktur\t\t: dr. H. Haris Tiyanto, Sp.B \n" +
                "SK Pendirian\t\t: PERDA KAB KENDAL NO 21 TAHUN 2007" +
                "Dibuka...\n" +
                "Layanan RAPID ANTIGEN SWAB\n" +
                "di RSUD Dr H Soewondo Kendal untuk jumlah pasien per hari 10 orang\n" +
                "Pendaftaran HANYA melalui WA dengan Nomor 085 86800 2000(pada hari H pemeriksaan sebelum jam 11.00 WIB)tersedia 2 paket:\n" +
                "Paket Rp 200.000 = Pendaftaran Pemeriksaan Rapid Antigen Swab Hasil Laboratorium\n" +
                "Paket Rp 240.000 = Pendaftaran Pemeriksaan Rapid Antigen Swab Hasil Laboratorium Surat Keterangan Dokter"
        );
        tv_alamatRS.add("Alamat: Jl. Laut No.21, Ngilir, Kec. Kendal, Kabupaten Kendal");

        gambar_rs.add(R.drawable.rs4moewardi);
        nama_rs.add("RS Umum Daerah Dr. Moewardi");
        tv_website.add("https://rsmoewardi.com/");
        wilayah_rs.add("Surakarta");
        detail_rs.add("Sebagai penghargaan atas jasa pahlawan Dr. Moewardi, yang semula hanya digunakan namanya untuk RS Kompleks Jebres, maka dengan Keputusan Gubernur Kepala daerah Tingkat I Jawa Tengah tanggal 24 Oktober 1988 Nomor: 445/29684 telah ditetapkan pemberian nama yang semula RSUD Kelas B \n" +
                "Propinsi Dati I Jawa Tengah di Surakarta (KompleksMangkubumen dan Jebres) menjadi RSUD Dr. Moewardi Surakarta. Pergantian nama ini diresmikan pada tanggal 10 November 1988 bersamaan denganhari pahlawan.\n" +
                "Vaksinasi bagi penyintas COVID-19 bisa dilakukan 1 bulan dan 3 bulan pasca dinyatakan sembuh dan hasil pemeriksaan swab negatif COVID-19.Perbedaan waktu pemberian ini, tergantung pada tingkat keparahan penyakit.\n" +
                "Bagi pasien dengan derajat keparahan penyakit ringan-sedang maka vaksinasi boleh diberikan dalam rentang waktu 1 bulan pasca sembuh.Sementara pasien dengan derajat keparahan penyakit berat-kritis makan vaksinasi boleh diberikan setelah 3 bulan dinyatakan sembuh.\n" +
                "\n" +
                "Dibuka............\n" +
                "-Mulai Senin, 20 Desember 2021 lokasi vaksinasi COVID-19 akan kembali ke eks. Klinik Sekar Moewardi (Sebelah Solo Paragon Mall).\n" +
                "-Vaksinasi kami layani setiap hari Senin-Jumat, di Poli Geriatri Gedung Wijaya Kusuma Lt.1 RSUD Dr. Moewardi.\n" +
                "-Bagi setiap pengunjung, pengantar, dan penunggu pasien yang belum mendapatkan vaksinasi COVID-19, baik dosis 1 maupun dosis 2 dipersilakan mengikuti vaksinasi di lokasi vaksin yaitu Klinik Geriatri kamar no.2 Gedung Wijaya Kusuma Lt.1 RSUD Dr. Moewardi.\n" +
                "-Manfaatkan program Serbuan Vaksin COVID-19 di RSUD Dr. Moewardi untuk semua warga (KTP semua domisili) berusia di atas 12 tahun.");
        tv_alamatRS.add("Alamat: Jl. Kolonel Sutarto No.132, Jebres, Kec. Jebres, Kota Surakarta");

        gambar_rs.add(R.drawable.rs5salatiga);
        nama_rs.add("RS Paru Dr. Ario Wirawan");
        tv_website.add("http://www.rspaw.or.id/");
        wilayah_rs.add("Salatiga");
        detail_rs.add("Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan." +
                "Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, \n" +
                "terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan.\n" +
                "RSUD Banyumas adalah rumah sakit tipe B Pendidikan milik Pemerintah Daerah Kabupaten Banyumas yang berdasarkan Keputusan Bupati Banyumas nomor 445/371/2008 tanggal 16 Juli 2008  tentang Penetapan Penerapan Pola Pengelolaan Keuangan Badan Layanan Umum daerah (PPK-BLUD) kepada RSUD Banyumas" +
                "RSUD Banyumas menyelenggarakan kegiatan pelayanan jasa kesehatan, pendidikan, pelatihan, penelitian dan pengembangan kesehatan. Sifat kegiatan tersebut berfungsi sosial, profesional, dan etis dengan pengelolaan keuangan berdasarkan prinsip ekonomi dan menerapkan praktik bisnis yang sehat. Pelayanan RSUD Banyumas saat ini adalah IGD, Poliklinik Rawat Jalan, Pelayanan Rawat Inap, Bedah Sentral, ICU, Penunjang (Laborat, Radiologi, Rehabilitasi Medis,Pendidikan dan Pelatihan, Gizi, sampai dengan Pemulasaraan Jenazah."
        );
        tv_alamatRS.add("Alamat: Jl. Hasanudin No.806, Mangunsari, Kec. Sidomukti, Kota Salatiga");

        gambar_rs.add(R.drawable.rs6ambarawa);
        nama_rs.add("RS Umum Daerah dr. Gunawan Mangunkusumo");
        tv_website.add("http://rsudambarawa.semarangkab.go.id/");
        wilayah_rs.add("Ambarawa");
        detail_rs.add("Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan." +
                "Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, \n" +
                "terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan.\n" +
                "RSUD Banyumas adalah rumah sakit tipe B Pendidikan milik Pemerintah Daerah Kabupaten Banyumas yang berdasarkan Keputusan Bupati Banyumas nomor 445/371/2008 tanggal 16 Juli 2008  tentang Penetapan Penerapan Pola Pengelolaan Keuangan Badan Layanan Umum daerah (PPK-BLUD) kepada RSUD Banyumas" +
                "RSUD Banyumas menyelenggarakan kegiatan pelayanan jasa kesehatan, pendidikan, pelatihan, penelitian dan pengembangan kesehatan. Sifat kegiatan tersebut berfungsi sosial, profesional, dan etis dengan pengelolaan keuangan berdasarkan prinsip ekonomi dan menerapkan praktik bisnis yang sehat. Pelayanan RSUD Banyumas saat ini adalah IGD, Poliklinik Rawat Jalan, Pelayanan Rawat Inap, Bedah Sentral, ICU, Penunjang (Laborat, Radiologi, Rehabilitasi Medis,Pendidikan dan Pelatihan, Gizi, sampai dengan Pemulasaraan Jenazah."
        );
        tv_alamatRS.add("Alamat: Jalan R.A. Kartini No. 101 Tambakboyo Lodoyong, Losari, Kec. Ambarawa");

        gambar_rs.add(R.drawable.rs7wongsonegoro);
        nama_rs.add("RS Umum Daerah K.R.M.T Wongsonegoro");
        tv_website.add("http://ppid.rsud.semarangkota.go.id/");
        wilayah_rs.add("Semarang");
        detail_rs.add("RSUD K.R.M.T Wongsonegoro merupakan Rumah Sakit Umum Daerah yang berdiri pada tahun 1990 dan terletak di wilayah Semarang, Jawa Tengah. RSUD K.R.M.T Wongsonegoro memiliki Visi menjadi Rumah Sakit terpercaya dalam bidang pelayanan, pendidikan dan penelitian. Dengan Misi memberi pelayanan secara paripurna, mengembangkan SDM, dan menyelenggarakan pendidikan, pelatihan dan penelitian.");
        tv_alamatRS.add("Alamat: Jl. Fatmawati No.1, Mangunharjo, Kec. Tembalang, Kota Semarang");

        gambar_rs.add(R.drawable.rs8rsudsalatiga);
        nama_rs.add("RS Umum Daerah Salatiga");
        tv_website.add("https://rsud.salatiga.go.id/");
        wilayah_rs.add("Salatiga");
        detail_rs.add("Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan." +
                "Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, \n" +
                "terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan.\n" +
                "RSUD Banyumas adalah rumah sakit tipe B Pendidikan milik Pemerintah Daerah Kabupaten Banyumas yang berdasarkan Keputusan Bupati Banyumas nomor 445/371/2008 tanggal 16 Juli 2008  tentang Penetapan Penerapan Pola Pengelolaan Keuangan Badan Layanan Umum daerah (PPK-BLUD) kepada RSUD Banyumas" +
                "RSUD Banyumas menyelenggarakan kegiatan pelayanan jasa kesehatan, pendidikan, pelatihan, penelitian dan pengembangan kesehatan. Sifat kegiatan tersebut berfungsi sosial, profesional, dan etis dengan pengelolaan keuangan berdasarkan prinsip ekonomi dan menerapkan praktik bisnis yang sehat. Pelayanan RSUD Banyumas saat ini adalah IGD, Poliklinik Rawat Jalan, Pelayanan Rawat Inap, Bedah Sentral, ICU, Penunjang (Laborat, Radiologi, Rehabilitasi Medis,Pendidikan dan Pelatihan, Gizi, sampai dengan Pemulasaraan Jenazah."
        );
        tv_alamatRS.add("Alamat: Jl. Osamaliki, Sidorejo Lor, Kec. Sidorejo, Kota Salatiga");

        gambar_rs.add(R.drawable.rs9sunankalijaga);
        nama_rs.add("RS Umum Daerah Sunan Kalijaga");
        tv_website.add("https://rsudsuka.demakkab.go.id/");
        wilayah_rs.add("Demak");
        detail_rs.add("Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan." +
                "Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, \n" +
                "terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan.\n" +
                "RSUD Banyumas adalah rumah sakit tipe B Pendidikan milik Pemerintah Daerah Kabupaten Banyumas yang berdasarkan Keputusan Bupati Banyumas nomor 445/371/2008 tanggal 16 Juli 2008  tentang Penetapan Penerapan Pola Pengelolaan Keuangan Badan Layanan Umum daerah (PPK-BLUD) kepada RSUD Banyumas" +
                "RSUD Banyumas menyelenggarakan kegiatan pelayanan jasa kesehatan, pendidikan, pelatihan, penelitian dan pengembangan kesehatan. Sifat kegiatan tersebut berfungsi sosial, profesional, dan etis dengan pengelolaan keuangan berdasarkan prinsip ekonomi dan menerapkan praktik bisnis yang sehat. Pelayanan RSUD Banyumas saat ini adalah IGD, Poliklinik Rawat Jalan, Pelayanan Rawat Inap, Bedah Sentral, ICU, Penunjang (Laborat, Radiologi, Rehabilitasi Medis,Pendidikan dan Pelatihan, Gizi, sampai dengan Pemulasaraan Jenazah."
        );
        tv_alamatRS.add("Alamat: Jl. Sultan Fatah 669/50, Bintoro, Kecamatan Demak, Bogorame, Bintoro, Kec. Demak");

        gambar_rs.add(R.drawable.rs10soedjati);
        nama_rs.add("RS Umum Daerah Dr. R.Soedjati Soemodiardjo");
        tv_website.add("https://rsud.grobogan.go.id/");
        wilayah_rs.add("Purwodadi,Grobogan");
        detail_rs.add("Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan." +
                "Berdasarkan Peraturan Daerah Kabupaten Banyumas Nomor 27 tahun 2009, RSUD Banyumas adalah salah satu Badan Teknis Daerah milik Pemerintah Kabupaten Banyumas yang mempunyai tugas melaksanakan upaya kesehatan secara efektif dan efisien dengan mengutamakan upaya penyembuhan serta pemulihan yang dilaksanakan secara serasi, \n" +
                "terpadu dengan upaya peningkatan dan pencegahan serta melaksanakan upaya rujukan.\n" +
                "RSUD Banyumas adalah rumah sakit tipe B Pendidikan milik Pemerintah Daerah Kabupaten Banyumas yang berdasarkan Keputusan Bupati Banyumas nomor 445/371/2008 tanggal 16 Juli 2008  tentang Penetapan Penerapan Pola Pengelolaan Keuangan Badan Layanan Umum daerah (PPK-BLUD) kepada RSUD Banyumas" +
                "RSUD Banyumas menyelenggarakan kegiatan pelayanan jasa kesehatan, pendidikan, pelatihan, penelitian dan pengembangan kesehatan. Sifat kegiatan tersebut berfungsi sosial, profesional, dan etis dengan pengelolaan keuangan berdasarkan prinsip ekonomi dan menerapkan praktik bisnis yang sehat. Pelayanan RSUD Banyumas saat ini adalah IGD, Poliklinik Rawat Jalan, Pelayanan Rawat Inap, Bedah Sentral, ICU, Penunjang (Laborat, Radiologi, Rehabilitasi Medis,Pendidikan dan Pelatihan, Gizi, sampai dengan Pemulasaraan Jenazah."
        );
        tv_alamatRS.add("Alamat: Jl. D. I. Panjaitan No.36, Ngabean, Purwodadi, Kec. Purwodadi, Kabupaten Grobogan");


        prosesrvAdapter();
    }
}