package lat1.shibaaazmi.tugas_akhir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Akun extends AppCompatActivity {

    FloatingActionButton add;
    Adapter_profil adapter_profil;
    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();
    ArrayList<model_data> list_data;
    RecyclerView rv_tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        add= findViewById(R.id.btn_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Akun.this, Tambah_profil.class));
            }
        });

        rv_tampil= findViewById(R.id.rv_tampil);
        RecyclerView.LayoutManager rv_layout= new LinearLayoutManager(this);
        rv_tampil.setLayoutManager(rv_layout);
        rv_tampil.setItemAnimator(new DefaultItemAnimator());

        tampilData();
    }

    private void tampilData() {
        databaseReference.child("profil").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list_data= new ArrayList<>();
                for(DataSnapshot item: snapshot.getChildren()){
                    model_data profil= item.getValue(model_data.class);
                    profil.setKey(item.getKey());
                    list_data.add(profil);
                }
                adapter_profil= new Adapter_profil(list_data,Akun.this);
                rv_tampil.setAdapter(adapter_profil);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}