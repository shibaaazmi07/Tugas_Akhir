package lat1.shibaaazmi.tugas_akhir;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecylerViewAdapter_virus  extends RecyclerView.Adapter<RecylerViewAdapter_virus.ViewHolder> {
    private ArrayList<String> gambarVirus= new ArrayList<>();
    private ArrayList<String> nama_virus= new ArrayList<>();
    private ArrayList<String> ket_virus= new ArrayList<>();
    private Context context;

    public RecylerViewAdapter_virus(ArrayList<String> gambarVirus, ArrayList<String> nama_virus, ArrayList<String> ket_virus ,Context context) {
        this.gambarVirus = gambarVirus;
        this.nama_virus = nama_virus;
        this.ket_virus= ket_virus;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //untuk menginputkan desain virus adapter ke rvadapter
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.virus_adapter,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(gambarVirus.get(position)).into(holder.iv_Virus);
        holder.tv_namaVirus.setText(nama_virus.get(position));

        holder.constraintLayout_virusadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Toast.makeText(context, nama_virus.get(position), Toast.LENGTH_LONG).show();
                Intent intent= new Intent(context,Detail_Virus.class);

                intent.putExtra("gambar_virus",gambarVirus.get(position));
                intent.putExtra("nama_virus",nama_virus.get(position));
                intent.putExtra("ket_virus",ket_virus.get(position));
                context.startActivities(new Intent[]{intent});


            }
        });
    }

    @Override
    public int getItemCount() {
        return nama_virus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView iv_Virus;
        TextView tv_namaVirus;
        ConstraintLayout constraintLayout_virusadapter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_Virus=itemView.findViewById(R.id.iv_Virus);
            tv_namaVirus= itemView.findViewById(R.id.tv_namaVirus);
            constraintLayout_virusadapter= itemView.findViewById(R.id.constraintLayout_virusadapter);
        }
    }
}
