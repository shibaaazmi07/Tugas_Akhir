package lat1.shibaaazmi.tugas_akhir;

import static android.text.Html.fromHtml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText etUserNameR, etPassR, etCPR;
    Button btnsave;

    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUserNameR= findViewById(R.id.etUNregister);
        etPassR= findViewById(R.id.etPassregister);
        etCPR= findViewById(R.id.etCP);
        btnsave= findViewById(R.id.btnsave);

        TextView tvRegister= findViewById(R.id.tvregister);

        sharedPref= getSharedPreferences("sp_login", Context.MODE_PRIVATE);

        tvRegister.setText(fromHtml("Kembali ke "+ "</font><font color='white'>Login</font>" ));
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username= etUserNameR.getText().toString().trim();
                String password= etPassR.getText().toString().trim();
                String confirm= etCPR.getText().toString().trim();

                if(!password.equals(confirm)){
                    Toast.makeText(RegisterActivity.this, "Password tidak cocok", Toast.LENGTH_SHORT).show();
                }else if(password.equals("") || username.equals("")){
                    Toast.makeText(RegisterActivity.this, "Pastikan username atau password tidak kosong", Toast.LENGTH_SHORT).show();
                }else{
                    SharedPreferences.Editor editor= sharedPref.edit();
                    editor.putString("username",username);
                    editor.putString("password",password);
                    editor.apply();

                    Toast.makeText(RegisterActivity.this,"Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

    }


}