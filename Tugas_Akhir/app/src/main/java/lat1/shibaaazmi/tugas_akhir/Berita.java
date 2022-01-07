package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Berita extends AppCompatActivity {

    ListView lv_berita;
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
        setContentView(R.layout.activity_berita);

        lv_berita= findViewById(R.id.lv_berita);
        News_Adapter news_adapter= new News_Adapter(this,judul_news,ringkasan_news,pp_news,urls);
        lv_berita.setAdapter(news_adapter);
    }


}