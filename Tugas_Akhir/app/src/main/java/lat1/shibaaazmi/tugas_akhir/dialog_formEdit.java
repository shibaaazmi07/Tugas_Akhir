package lat1.shibaaazmi.tugas_akhir;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class dialog_formEdit extends DialogFragment {
    String nama, email, alamat, key, pilihan;
    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();
    //construktor
    public dialog_formEdit(String nama, String email, String alamat, String key, String pilihan) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.key = key;
        this.pilihan = pilihan;
    }

    TextView baru_addnama, baru_addemail, baru_addalamat;
    Button btn_baru_simpan_profil;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.activity_tambah_profil, container, false);
        baru_addnama= view.findViewById(R.id.et_addnama);
        baru_addemail= view.findViewById(R.id.et_addemail);
        baru_addalamat= view.findViewById(R.id.et_addalamat);
        btn_baru_simpan_profil= view.findViewById(R.id.btn_simpan_profil);

        baru_addnama.setText(nama);
        baru_addemail.setText(email);
        baru_addalamat.setText(alamat);
        btn_baru_simpan_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama= baru_addnama.getText().toString();
                String email= baru_addemail.getText().toString();
                String alamat= baru_addalamat.getText().toString();
                if(pilihan.equals("Ubah")){
                    databaseReference.child("profil").child(key).setValue(new model_data(nama, email, alamat)).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(view.getContext(), "Data terupdate", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(view.getContext(), "Gagal mengupdate data!", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog= getDialog();
        if(dialog != null){
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
    }
}
