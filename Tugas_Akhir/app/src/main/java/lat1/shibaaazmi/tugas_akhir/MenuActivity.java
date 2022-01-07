package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    LinearLayout menu_virus, menu_hospital, menu_tips, menu_profil;
    TextView tvSeemore;
    Button button_keluar;

    ListView lvnews;
    String[] judul_news={
            "Pfizer Gagal Uji Klinis Vaksin COVID-19 Pada Anak 2-5 Tahun, Ini Sebabnya",
            "Vaksin Covid untuk Anak 6 Tahun di DKI, Ini Info yang Wajib Diketahui",
            "Waspada Varian Omicron, Ini 9 Saran Epidemiolog untuk Pemerintah",
            "Data Lengkap Corona RI 18 Desember, 11 Provinsi Nihil Kasus",
            "Entaskan Stunting, Anggota Komisi IX DPR: Kerja Tim Seluruh Perangkat Daerah" ,
            "Cegah Stunting di Bekasi, Bunda Duta Gizi Dihadirkan dalam Rumah Bunda Sehat"
    };
    String[] ringkasan_news={
            "Pfizer menjelaskan uji klinis pemberian vaksin pada anak 2-5 tahun ternyata tidak memberi respons imun yang kuat. Pfizer berencana mengubah uji klinisnya dengan menambah dosis vaksin, total menjadi tiga dosis." ,
            "usia 6 tahun mulai dilaksanakan di DKI Jakarta. Pelaksanaan vaksinasi untuk anak 6-11 tahun dilakukan sesuai Instruksi Presiden. Vaksinasi anak dilakukan secara bertahap dan dilaksanakan oleh provinsi juga kabupaten/kota yang telah memenuhi syarat.",
            "Epidemiolog Masdalina Pane meminta agar pemerintah menyiapkan rencana kontingensi untuk mengantisipasi apabila kasus COVID-19 varian Omicron ini mengalami peningkatan kasus. Ia meminta persiapan harus dilakukan pemerintah agar tidak ada lagi kehabisan oksigen dan kamar ICU.",
            "Angka COVID-19 di Tanah Air bertambah 232 kasus baru. Hari ini terdapat 11 provinsi yang melaporkan nol kasus atau nihil kasus.Data perkembangan penyebaran COVID-19 dipublikasikan Humas BNPB, Sabtu (18/12/2021). Data kasus COVID-19 diperbarui setiap hari per pukul 12.00 WIB" ,
            "JAKARTA - Komisi IX DPR mengapresiasi kinerja Badan Kependudukan dan Keluarga Berencana Nasional (BKKBN) Pusat yang telah membantu percepatan pengentasan stunting, melalui pemberian dana Bantuan Operasional Keluarga Berencana (BOKB), yang diberikan terus menerus setiap tahunnya." ,
            "Kota Bekasi dengan jumlah penduduk yang tinggi, karakter masyarakat yang heterogen serta mobilitas yang tinggi, berpotensi memiliki berbagai masalah sosial di masyarakat, termasuk kesehatan seperti stunting."
    };

    int[] pp_news={
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news6
    };

    String[] urls={
            "https://health.detik.com/berita-detikhealth/d-5860836/pfizer-gagal-uji-klinis-vaksin-covid-19-pada-anak-2-5-tahun-ini-sebabnya",
            "https://news.detik.com/berita/d-5859573/vaksin-covid-untuk-anak-6-tahun-di-dki-ini-info-yang-wajib-diketahui?_ga=2.88058136.1646558918.1639851122-339948818.1617206116",
            "https://news.detik.com/berita/d-5860975/waspada-varian-omicron-ini-9-saran-epidemiolog-untuk-pemerintah?mtype=mpt",
            "https://news.detik.com/berita/d-5860873/data-lengkap-corona-ri-18-desember-11-provinsi-nihil-kasus?mtype=mpt&_ga=2.20242616.1646558918.1639851122-339948818.1617206116",
            "https://nasional.sindonews.com/read/605429/15/entaskan-stunting-anggota-komisi-ix-dpr-kerja-tim-seluruh-perangkat-daerah-1637424700",
            "https://metro.sindonews.com/read/558824/171/cegah-stunting-di-bekasi-bunda-duta-gizi-dihadirkan-dalam-rumah-bunda-sehat-1633331402"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu_hospital= findViewById(R.id.menu_hospital);
        menu_virus=findViewById(R.id.menu_virus);
        menu_tips=findViewById(R.id.menu_tips);
        menu_profil= findViewById(R.id.menu_profil);
        lvnews= findViewById(R.id.rvNews);
        tvSeemore= findViewById(R.id.tvSeemore);
        button_keluar= findViewById(R.id.button_keluar);

        menu_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hospital= new Intent(MenuActivity.this,Hospital.class);
                startActivity(hospital);
            }
        });


        menu_virus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent virus= new Intent(MenuActivity.this,Virus.class);
                startActivity(virus);
            }
        });

        menu_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tips= new Intent(MenuActivity.this,Tips.class);
                startActivity(tips);
            }
        });

        menu_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil= new Intent(MenuActivity.this,Akun.class);
                startActivity(profil);
            }
        });

        tvSeemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent berita= new Intent(MenuActivity.this,Berita.class);
                startActivity(berita);
            }
        });

        button_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder= new AlertDialog.Builder(MenuActivity.this);
                builder.setMessage("Apakah anda akan keluar dari I-Kes?");
                builder.setCancelable(true);
                builder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog= builder.create();
                alertDialog.show();
            }
        });

        News_Adapter news_adapter= new News_Adapter(this,judul_news,ringkasan_news,pp_news,urls);
        lvnews.setAdapter(news_adapter);
    }
}