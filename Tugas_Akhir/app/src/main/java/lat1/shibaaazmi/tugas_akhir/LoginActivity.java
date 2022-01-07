package lat1.shibaaazmi.tugas_akhir;

import static android.text.Html.fromHtml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etUserName, etPass;
    Button btnLogin;
    private CheckBox chkRememberUsername;

    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName= findViewById(R.id.etUserName);
        etPass= findViewById(R.id.etpass);
        btnLogin= findViewById(R.id.btnlogin);
        chkRememberUsername = findViewById(R.id.chk_remember_username);

        //inisialisasi sharepreferences
        sharedPref= getSharedPreferences("sp_login", Context.MODE_PRIVATE);

        loadSavedUsername();

        TextView tvAkunBaru= findViewById(R.id.tvAkunbaru);
        tvAkunBaru.setText(fromHtml("Saya belum memiliki akun "+ "</font><font color='white'>buat baru</font>"));

        tvAkunBaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

    }
    public void onBtnLogin_Click(View view) {
        String username= etUserName.getText().toString();
        String password= etPass.getText().toString();

        String register_username= sharedPref.getString("username","");
        String register_password= sharedPref.getString("password","");

        if(username.equals(register_username)&& password.equals(register_password)){
            Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(intent);
            saveUsername();
        }else{
            Toast.makeText(LoginActivity.this,"Login gagal,periksa kembali username/password", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveUsername(){
        SharedPreferences.Editor editor= sharedPref.edit();
        if(chkRememberUsername.isChecked())
            editor.putString("username",etUserName.getText().toString());
        else
            editor.remove("username");
        editor.apply();
    }

    private void loadSavedUsername()
    {
        // Memeriksa apakah sebelumnya ada username yang tersimpan?
        // Jika ya, maka tampilkan username tersebut di EditText username.

        String save_username= sharedPref.getString("username",null);
        if(save_username!= null){
            etUserName.setText(save_username);
            chkRememberUsername.setChecked(true);
        }
    }
}