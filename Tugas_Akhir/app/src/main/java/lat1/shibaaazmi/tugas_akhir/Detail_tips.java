package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail_tips extends AppCompatActivity {

    ImageView iv_detail_tips;
    TextView tv_detailjudul_tips, tv_detail_keterangan_tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tips);

        iv_detail_tips= findViewById(R.id.iv_detail_tips);
        tv_detailjudul_tips= findViewById(R.id.tv_detailjudul_tips);
        tv_detail_keterangan_tips=findViewById(R.id.tv_detail_keterangan_tips);

        getEkstraTips();
    }

    private void getEkstraTips(){
        if(getIntent().hasExtra("gambar_tips") && getIntent().hasExtra("judul_tips")&& getIntent().hasExtra("ket_tips")){
            int gambar_tips= getIntent().getIntExtra("gambar_tips",1);
            String judul_tips= getIntent().getStringExtra("judul_tips");
            String ket_tips= getIntent().getStringExtra("ket_tips");

            setdatatips(gambar_tips, judul_tips,ket_tips );
        }
    }

    private  void setdatatips(int gambar_tips, String judul_tips, String ket_tips ){
        Glide.with(this).asBitmap().load(gambar_tips).into(iv_detail_tips);
        tv_detailjudul_tips.setText(judul_tips);
        tv_detail_keterangan_tips.setText(ket_tips);
    }
}