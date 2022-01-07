package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detail_rs extends AppCompatActivity {

    ImageView gambar_rs;
    TextView tv_detailnamaRS, tv_detail_keteranganRS, tv_website, tv_alamatRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rs);

        gambar_rs= findViewById(R.id.iv_detailRS);
        tv_detailnamaRS= findViewById(R.id.tv_detailnamaRS);
        tv_detail_keteranganRS= findViewById(R.id.tv_detail_keteranganRS);
        tv_website= findViewById(R.id.tv_website);
        tv_alamatRS= findViewById(R.id.tv_alamatRS);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if(getIntent().hasExtra("imageRS") && getIntent().hasExtra("nameRS") && getIntent().hasExtra("website") && getIntent().hasExtra("keteranganRS") && getIntent().hasExtra("alamatRS")){
            int gambarRS= getIntent().getIntExtra("imageRS",1);
            String nmRS= getIntent().getStringExtra("nameRS");
            String webRS= getIntent().getStringExtra("website");
            String ketRS= getIntent().getStringExtra("keteranganRS");
            String almRS= getIntent().getStringExtra("alamatRS");

            setData(gambarRS,nmRS,webRS,ketRS, almRS);
        }
    }

    private void setData(int gambarRS, String nmRS, String webRS, String ketRS, String almRS) {
        Glide.with(this).asBitmap().load(gambarRS).into(gambar_rs);

        tv_detailnamaRS.setText(nmRS);
        tv_website.setText(webRS);
        tv_detail_keteranganRS.setText(ketRS);
        tv_alamatRS.setText(almRS);

    }
}