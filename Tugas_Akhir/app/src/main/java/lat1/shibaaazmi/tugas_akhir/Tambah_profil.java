package lat1.shibaaazmi.tugas_akhir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Tambah_profil extends AppCompatActivity {
    EditText et_addnama, et_addemail,et_addalamat;
    Button btn_simpan_profil;
    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_profil);

        et_addnama= findViewById(R.id.et_addnama);
        et_addemail= findViewById(R.id.et_addemail);
        et_addalamat= findViewById(R.id.et_addalamat);
        btn_simpan_profil= findViewById(R.id.btn_simpan_profil);

        btn_simpan_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getNama= et_addnama.getText().toString();
                String getEmail= et_addemail.getText().toString();
                String getAlamat= et_addalamat.getText().toString();

                if(getNama.isEmpty()){
                    et_addnama.setError("Masukan nama!");
                }else if(getEmail.isEmpty()){
                    et_addemail.setError("Masukan email aktif anda!");
                }else if(getAlamat.isEmpty()){
                    et_addalamat.setError("Masukan alamat tempat tinggal!");
                }else { //membuat table data
                    databaseReference.child("profil").push().setValue(new model_data(getNama,getEmail,getAlamat)).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(Tambah_profil.this,"Data berhasil disimpan",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Tambah_profil.this,Akun.class));
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Tambah_profil.this,"Gagal menyimpan data",Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

    }
}