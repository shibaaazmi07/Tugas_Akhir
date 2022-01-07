package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail_Virus extends AppCompatActivity {

    ImageView iv_detail_virus;
    TextView tv_detailnamavirus,tv_detail_keteranganvirus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_virus);

        iv_detail_virus=(ImageView) findViewById(R.id.iv_detail_virus);
        tv_detailnamavirus= (TextView)findViewById(R.id.tv_detailnamavirus);
        tv_detail_keteranganvirus=(TextView)findViewById(R.id.tv_detail_keteranganvirus);

        // menerima data
        getlastdata();
    }

    private void getlastdata(){
        if(getIntent().hasExtra("gambar_virus") &&getIntent().hasExtra("nama_virus") && getIntent().hasExtra("ket_virus")){
            String gambarVirus= getIntent().getStringExtra("gambar_virus");
            String nama_virus= getIntent().getStringExtra("nama_virus");
            String ket_virus= getIntent().getStringExtra("ket_virus");

            setDatavirus(gambarVirus,nama_virus,ket_virus);
        }
    }

    private void setDatavirus(String gambarVirus,String nama_virus, String ket_virus ){
        Glide.with(this).asBitmap().load(gambarVirus).into(iv_detail_virus);
        tv_detailnamavirus.setText(nama_virus);
        tv_detail_keteranganvirus.setText(ket_virus);
    }
}