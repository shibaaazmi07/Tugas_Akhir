package lat1.shibaaazmi.tugas_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
    }

    public void hal_login(View view) {
        Intent intent= new Intent(halaman2.this,LoginActivity.class);
        startActivity(intent);
    }
}