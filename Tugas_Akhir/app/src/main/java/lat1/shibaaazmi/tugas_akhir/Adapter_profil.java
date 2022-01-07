package lat1.shibaaazmi.tugas_akhir;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class Adapter_profil extends RecyclerView.Adapter<Adapter_profil.mvHolder> {
    private List<model_data> mList;
    private Activity activity;
    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();

    public Adapter_profil(List<model_data>mList,Activity activity){
        this.mList= mList;
        this.activity= activity;
    }

    @NonNull
    @Override
    public mvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //menyambungkan activity akun dengan layout item
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View viewItem= inflater.inflate(R.layout.layout_item,parent,false);
        return new mvHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull mvHolder holder, int position) {
        final model_data data= mList.get(position);
        holder.tv_nama_profil.setText("Nama : "+data.getNama());
        holder.tv_email.setText("Alamat email : "+data.getEmail());
        holder.tv_alamat.setText("Alamat tempat tinggal : "+data.getAlamat());

        holder.hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder= new AlertDialog.Builder(activity);
                builder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        databaseReference.child("profil").child(data.getKey()).removeValue().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(activity, "Data terhapus", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(activity, "Data tidak terhapus!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).setMessage("Apakah anda yakin akan mengapus ? "+ data.getNama());
                builder.show();
            }
        });

        holder.card_hasil.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                FragmentManager manager= ((AppCompatActivity)activity).getSupportFragmentManager();
                // mengambil data dari construktor dialog from edit
                dialog_formEdit dialog_formEdit= new dialog_formEdit(
                        data.getNama(),
                        data.getEmail(),
                        data.getAlamat(),
                        data.getKey(),
                        "Ubah"
                );
                dialog_formEdit.show(manager,"from");
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class mvHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_profil, tv_email, tv_alamat;
        CardView card_hasil;
        ImageView hapus;

        public mvHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama_profil= itemView.findViewById(R.id.tv_nama_profil);
            tv_email= itemView.findViewById(R.id.tv_email);
            tv_alamat= itemView.findViewById(R.id.tv_alamat);
            card_hasil= itemView.findViewById(R.id.card_hasil);
            hapus= itemView.findViewById(R.id.hapus);

        }
    }
}
