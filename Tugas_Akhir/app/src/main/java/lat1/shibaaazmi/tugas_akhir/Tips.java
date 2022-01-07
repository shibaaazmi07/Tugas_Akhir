package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Tips extends AppCompatActivity {

    private ArrayList<Integer> gambar_tips= new ArrayList<>();
    private ArrayList<String> judul_tips= new ArrayList<>();
    private ArrayList<String> ket_tips= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        getdata_tips();
    }

    private void prosesRecylerViewAdapter_tips(){
        RecyclerView recyclerView= findViewById(R.id.rvTips);
        RecylerViewAdapter_tips recylerViewAdapter_tips= new RecylerViewAdapter_tips(gambar_tips,judul_tips,ket_tips,this);

        recyclerView.setAdapter(recylerViewAdapter_tips);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getdata_tips(){
        gambar_tips.add(R.drawable.makanan_sehat);
        judul_tips.add("4 Sehat 5 Sempurna");
        ket_tips.add("Sayuran hijau dan berdaun kaya akan vitamin yang membantu Anda menjaga diet seimbang dan mendukung sistem kekebalan tubuh yang sehat.\n" +
                "Menurut sebuah peercobaan yang dilakukan pada tikus, makan sayuran criciferous, seperti brokoli, kembang kol, dan kol, dapat membantu mengirimkan sinyal kimia ke tubuh yang meningkatkan protein pada permukaan sel yang diperlukan untuk membuat kerja sistem kekebalan tubuh lebih optimal.\n" +
                "Dalam penelitian ini, tikus sehat yang tidak makan sayuran hijau mengalami penurunan potein permukaan sel sebesar 70-80 persen.");

        gambar_tips.add(R.drawable.vitamin_d);
        judul_tips.add("Konsumsi vitamin D");
        ket_tips.add("Kekurangan vitamin D dapat menyebabkan gejala seperti pertumbuhan tulang yang buruk, masalah jantung, dan sistem kekebalan tubuh yang lemah.\n" +
                "Makanan yang mengandung sumber vitamin D terbaik antara lain kuning telur, jamur, ikan salmon, ikan tuna, dan hati sapi. Anda juga bisa membeli suplemen vitamin D dan pilih yang mengandung D3 (cholecalciferol), \n" +
                "karena ini baik dalam meningkatkan kadar vitamin D dalam darah Anda.\n" +
                "Namun sebelum mengnsumsi suplemen, sebaiknya konsultasikan hal ini pada dokter.");

        gambar_tips.add(R.drawable.olahraga);
        judul_tips.add("Olahraga rutin");
        ket_tips.add("Tetap aktif dengan melakukan olahraga secara rutin. Anda bisa mulai dengan olahraga yang ringan seperti berjalan kaki. Olahraga dengan teratur bisa membuat Anda bugar dan langsing.\n" +
                "Selain itu, sebuah penelitian membuktikan bahwa olahraga teratur dapat mencegah peradangan dan penyakit kronis, mengurangi stres, serta mempercepat peredaran sel darah putih dalam melawan penyakit.\n");

        gambar_tips.add(R.drawable.teh_hijau);
        judul_tips.add("Minum teh hijau");
        ket_tips.add("Teh hijau telah dikaitkan dengan kesehatan yang baik. Manfaat kesehatan teh hijau mungkin karena tingginya tingkat antioksidan, yang disebut flavonoid. Sehingga dapat menurunkan tekanan darah dan mengurangi risiko penyakit kardiovaskular.\n" +
                "Maka itu, karena mudah untuk dilakukan cara menjaga kesehatan tubuh yang satu ini sudah banyak dilakukan.\n");

        gambar_tips.add(R.drawable.tidur);
        judul_tips.add("Tidur yang cukup");
        ket_tips.add("Tidur yang cukup merupakan salah satu kunci dari kekebalan tubuh yang kuat. Sebuah penelitian menunjukan bahwa orang yang tidur minimal delapan jam setiap malam selama dua minggu menunjukkan bahwa tubuh lebih kebal dari serangan virus dan kuman bakteri. Sementara, orang yang kurang dari 6 jam setiap malam akan 4 kali lebih mudah mengalami flu karena virus dibandingkan orang yang tidur 7 jam atau lebih.\n" +
                "Hal ini disebabkan oleh sitokin yang dilepaskan tubuh selama tidur yang lama. Sitokin adalah sejenis protein yang membantu tubuh melawan infeksi dengan meningkatkan sistem kekebalan tubuh.");

        prosesRecylerViewAdapter_tips();
    }
}