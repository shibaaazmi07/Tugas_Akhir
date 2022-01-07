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

public class RecylerViewAdapter_tips extends RecyclerView.Adapter<RecylerViewAdapter_tips.ViewHolder> {

    private ArrayList<Integer> gambar_tips= new ArrayList<>();
    private ArrayList<String> judul_tips= new ArrayList<>();
    private ArrayList<String> ket_tips= new ArrayList<>();
    private Context context;

    public RecylerViewAdapter_tips(ArrayList<Integer> gambar_tips, ArrayList<String> judul_tips, ArrayList<String> ket_tips,Context context) {
        this.gambar_tips = gambar_tips;
        this.judul_tips = judul_tips;
        this.ket_tips= ket_tips;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tips_adapter,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  final int position) {
        Glide.with(context).asBitmap().load(gambar_tips.get(position)).into(holder.iv_Tips);

        holder.tv_Tips.setText(judul_tips.get(position));

        holder.tips_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context, Detail_tips.class);
                intent.putExtra("gambar_tips",gambar_tips.get(position));
                intent.putExtra("judul_tips",judul_tips.get(position));
                intent.putExtra("ket_tips",ket_tips.get(position));

                context.startActivities(new Intent[]{intent});
            }
        });

    }

    @Override
    public int getItemCount() {
        return judul_tips.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView iv_Tips;
        TextView tv_Tips;
        ConstraintLayout tips_constraint;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_Tips= itemView.findViewById(R.id.iv_Tips);
            tv_Tips= itemView.findViewById(R.id.tv_Tips);
            tips_constraint= itemView.findViewById(R.id.tips_constraint);
        }
    }

}
