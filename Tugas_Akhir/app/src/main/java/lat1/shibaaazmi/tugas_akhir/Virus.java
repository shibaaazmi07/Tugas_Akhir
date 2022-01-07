package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Virus extends AppCompatActivity {

    private ArrayList<String> gambarVirus= new ArrayList<>();
    private ArrayList<String> nama_virus= new ArrayList<>();
    private ArrayList<String> ket_virus= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus);

        getData_virus();
    }

    private void prosesRecylerViewAdapter_virus(){
        RecyclerView recyclerView= findViewById(R.id.rvVirus);
        RecylerViewAdapter_virus recylerViewAdapter_virus= new RecylerViewAdapter_virus(gambarVirus,nama_virus,ket_virus,this);
        recyclerView.setAdapter(recylerViewAdapter_virus);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData_virus(){
        gambarVirus.add("https://rskasihibu.com/wp-content/uploads/2018/08/Screw-the-Flu-3-Belly-Blog-Talia-Zenlea.jpg");
        nama_virus.add("Influenza");
        ket_virus.add("Influenza atau yang lebih umum dikenal dengan flu adalah penyakit menular yang paling umum diderita oleh orang-orang. Influenza ini disebabkan oleh virus. Virus influenza adalah virus yang setiap waktunya bermutasi, sehingga sistem imunitas tubuh sulit mendeteksi virus yang satu ini. Karena sulitnya sistem imun tubuh mendeteksi virus influenza ini, maka tubuh cenderung lebih mudah terkena flu. Bahkan tubuh dapat beberapa kali terkena flu dalam waktu yang berdekatan.\n" +
                "\n" +
                "Media Penularan :\n" +
                "Flu dapat ditularkan melalui sistem pernapasan juga melalui air ludah. Maka jika kita berdekatan dengan orang yang sedang flu, kemungkinan kita tertular flu sangatlah besar. Perantara udara adalah media penularan flu yang paling cepat.\n" +
                "\n" +
                "Cara Pencegahan :\n" +
                "Menjaga daya tahan tubuh agar tidak mudah terserang virus. Misalnya dengan makan teratur, istirahat yang cukup, minum air putih sesuai kebutuhan, berolah raga, dan memiliki gaya hidup yang sehat.Selain itu, menjaga daya tahan tubuh juga dapat juga didukung dengan asupan vitamin terutama Vitamin C yang bisa didapatkan di buah-buahan maupun vitamin yang dijual di toko-toko.\n" +
                "Pencegahan lainnya adalah dengan menggunakan masker ditempat umum, terutama bagi yang menderita influenza.");

        gambarVirus.add("https://asset.kompas.com/crops/nN6wnNVC0RWvjLrwTE3dQ20yatY=/0x0:995x663/780x390/data/photo/2020/03/23/5e7837ada845b.jpg");
        nama_virus.add("Tuberkulosis (TBC)");
        ket_virus.add("Tuberkulosis adalah penyakit infeksi saluran pernapasan yang disebabkan oleh bakteri basil. Bakteri basil yang menginfeksi adalah bakteri basil yang sangat kuat. Akibtanya, akan membutuhkan waktu yang lama untuk mengobati penyakit ini. Bakteri ini 90% cenderung menginfeksi paru-paru jika dibandingkan dengan organ-organ lainnya pada tubuh manusia. Penyakit ini biasanya ditandai dengan batuk terus menerus.\n" +
                "\n" +
                "Penularan\n" +
                "TBC adalah penyakit yang menyerang pernapasan. Maka penularannya pun melalui pernapasan. Berdekatan dengan penderita TBC dapat memungkinkan kita untuk tertular. Selain itu, ketika penderita TBC batuk pun, bisa jadi itu merupakan  sarana penularan TBC.\n" +
                "Selain itu, penggunaan barang pribadi secara bergantian dengan penderita TBC aktif, seperti gelas dan sendok pun dapat menjadi jembatan penularan TBC.\n" +
                "\n" +
                "Cara Pencegahan\n" +
                "Mengurangi kotak dengan penderita TBC aktif. Jika akan kontak pun, gunakanlah masker untuk melindungi pernapasan kita. Serta hindari penggunaan barang pribadi yang bergantian dengan penderita TBC aktif.\n" +
                "Pemberian Vaksin BCG (diberikan pada saat balita)\n" +
                "Menjaga pola hidup yang baik dengan asupan makanan yang bergizi dan olah raga teratur.");

        gambarVirus.add("http://gizi.unida.gontor.ac.id/wp-content/uploads/2020/09/artikel-5400-main_gambar-kartun-anak-sakit-perut-624x624.jpg");
        nama_virus.add("Muntaber");
        ket_virus.add("Muntaber adalah penyakit peradangan usus yang disebabkan oleh virus, bakteri, ataupun parasit lain seperti jamur, protozoa dan cacing. Selain karena itu, muntaber juga dapat disebabkan oleh keracunan makanan atau minuman yang mengandung bakteri atau zat kimia.  Bakteri yang biasanya merupakan penyebab dari muntaber adalah bakteri Escherichia Coli.\n" +
                "Kondisi lingkungan, terutama sanitasi air yang tidak bersih merupakan salah satu faktor besar dalam penyebaran penyakit ini.\n" +
                "\n" +
                "Penularan\n" +
                "Melalui cairan dari mulut (muntah) yang tidak dibersihkan dengan baik\n" +
                "Melalui sisa kotoran yang menyebar di air yang dgunakan\n" +
                "Melalui saluran air. Terutama jika sanitasi air di lingkungan sekitar masih buruk.\n" +
                "Lingkungan yang tidak bersih atau sedang dalam kondisi seperti banjir yang tidak memungkinkan memiliki air bersih.\n" +
                "\n" +
                "Cara Pencegahan\n" +
                "Menjaga asupan makanan yang dikonsumsi secara cukup dan seimbang\n" +
                "Penggunaan air bersih untuk kegiatan sehari-hari terutama air minum\n" +
                "Mencuci tangan secara teratur untuk menghindari bakteri menempel pada tangan. Terutama sebelum dan setelah makan\n" +
                "Menjaga kebersihan rumah dan lingkungan sekitar\n" +
                "Membuang tinja pada tempatnya dan membersihkan dengan baik\n" +
                "Mencuci seluruh bahan makanan sebelum masuk proses pemasakan\n" +
                "Menjaga kebersihan peralatan makan dan minum");

        gambarVirus.add("https://merahputih.com/media/5d/39/c0/5d39c040f5206155c1315185bfc4b56a.jpg");
        nama_virus.add("Tifus");
        ket_virus.add("Tifus adalah penyakit infeksi pada usus halus yang disebabkan oleh bakteri salmonella.Biasanya ditandai dengan demam yang suhunya naik secara bertahap hingga membuat pendeita menggigil. Biasanya demam terjadi di malam hari dan mereda, kemudian akan naik lagi di malam berikutnya. Gejala yang lain dapat berupa  sakit kepala, sakit di bagian perut, denyut jantung menurun, sampai kehilangan nafsu makan.\n" +
                "\n" +
                "Penularan\n" +
                "Melalui makanan yang tercemar bakteri salmonella. Ini bisa terjadi karena sumber makanan yang tidak sehat ataupun pembersihan yang tidak baik sebelum bahan makanan tersebut dimakan. Bahkan pada sebagian kasus, ada yang disebabkan menempelnya lalat pada makanan yang sebelumnya hinggap di tinja atau kotoran milik penderita tifus. Akhirnya lalat tersebut menjadi perantara penularan tifus.\n" +
                "Melalui tangan dan kuku yang tidak bersih, sehingga tanpa kita sadari bakteri salmonella yang bisa saja terdapat pada tangan dan kuku kita masuk ke dalam mulut.\n" +
                "Melalui air yang digunakan untuk minum atau mencuci piring dan gelas dan peralatan makan lainnya. Untuk itulah beberapa ahli mengatakan bahwa bahaya air minum isi ulang wajib diwaspadai.\n" +
                "Melalui kulit. Bakteri ini dapat masuk lewat kulit yang terkoyak akibat luka. Bisa luka bekas operasi, terjauth, atau luka lainnya.\n" +
                "Tifus juga dapat menular melalui lingkungan yang tidak bersih.\n" +
                "\n" +
                "\n" +
                "Cara Pencegahan\n" +
                "Memastikan kebersihan bahan makanan sebelum memasaknya\n" +
                "Mencuci tangan secara teratur, terutama sebelum dan setelah makanan\n" +
                "Membersihkan luka dan segera mengobatinya\n" +
                "Hindari jajan di pinggir jalan yang terlihat tidak higienis\n" +
                "Menjaga daya tahan tubuh.\n" +
                "Memakan makanan untuk penyakit tifus.");

        gambarVirus.add("https://cdn.medcom.id/dynamic/content/2021/06/11/1286817/tKTX8OYAZ6.jpg?w=500");
        nama_virus.add("DBD (Demam Berdarah Dengue)");
        ket_virus.add("DBD adalah penyakit menular yang disebabkan oleh virus dengue yang dibawa oleh nyamuk Aedes aegeypti Betina. Gejala yang umum terjadi adalah demam tinggi pada beberapa hari, sakit pada persendian, munculnya bintik-bintik merah, turunnya trombosit secara drastis, dan bisa terjadi pendarahan.\n" +
                "\n" +
                "Penularan\n" +
                "Ditularkan melalui gigitan nyamuk betina Aedes aegepty betina\n" +
                "\n" +
                "Cara Pencegahan\n" +
                "Membersihkan genangan air di sekitar rumah agar terbebas dari nyamuk Aedes aegepty.\n" +
                "Menutup tempat-tempat penyimpanan air.\n" +
                "Menguras bak mandi minimal satu minggu sekali\n" +
                "Memebersihkan pekarangan rumah dari barang-barang bekas yang berpotensi sebagai tempat perkembangan jentik nyamuk.");

        prosesRecylerViewAdapter_virus();
    }
}