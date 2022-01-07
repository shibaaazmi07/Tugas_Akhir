package lat1.shibaaazmi.tugas_akhir;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collection;

import de.hdodenhof.circleimageview.CircleImageView;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.ViewHolder> implements Filterable {


    private ArrayList<Integer> gambar_rs= new ArrayList<>();
    private ArrayList<String> nama_rs= new ArrayList<>();
    private ArrayList<String> tv_website= new ArrayList<>();
    private ArrayList<String> wilayah_rs= new ArrayList<>();
    private ArrayList<String> detail_rs= new ArrayList<>();
    private ArrayList<String> tv_alamatRS= new ArrayList<>();
    private ArrayList<String> alldata;
    private Context context;

    public rvAdapter(ArrayList<Integer> gambarRS, ArrayList<String> namaRS,ArrayList<String> tv_website ,ArrayList<String> wilayahRS, ArrayList<String> detailRS, ArrayList<String> tvalamatRS, Context context) {
        this.gambar_rs = gambarRS;
        this.nama_rs = namaRS;
        this.tv_website= tv_website;
        this.wilayah_rs = wilayahRS;
        this.detail_rs= detailRS;
        this.tv_alamatRS=tvalamatRS;
        this.context = context;
        this.alldata= new ArrayList<>(wilayahRS);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //layout inflater untuk menambahkan desai layout recyler view yang telah dibuat sebelumnya
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rs_adapter,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }
    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        //memasukkan data untuk setiap item
        Glide.with(context).asBitmap().load(gambar_rs.get(position)).into(holder.iv_RS);
        holder.tv_namaRS.setText(nama_rs.get(position));
        holder.tv_wilayah.setText(wilayah_rs.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,detail_rs.class);
                intent.putExtra("imageRS", gambar_rs.get(position));
                intent.putExtra("nameRS",nama_rs.get(position));
                intent.putExtra("website",tv_website.get(position));
                intent.putExtra("keteranganRS",detail_rs.get(position));
                intent.putExtra("alamatRS",tv_alamatRS.get(position));

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama_rs.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    //run on background tread
    Filter filter= new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList<String> filterdata= new ArrayList<>();
            if(charSequence.toString().isEmpty()){
                filterdata.addAll(alldata);
            }else {
                for(String alamat: alldata){
                    if(alamat.toLowerCase().contains(charSequence.toString().toLowerCase())){
                        filterdata.add(alamat);
                    }
                }
            }
            FilterResults filterResults= new FilterResults();
            filterResults.values= filterdata;

            return filterResults;
        }
        //run on ui tread
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            tv_alamatRS.clear();
            tv_alamatRS.addAll((Collection<? extends String>) filterResults.values);
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView iv_RS;
        TextView tv_namaRS;
        TextView tv_wilayah;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_RS= itemView.findViewById(R.id.iv_RS);
            tv_namaRS= itemView.findViewById(R.id.tv_namaRS);
            tv_wilayah= itemView.findViewById(R.id.tv_wilayah);
            constraintLayout= itemView.findViewById(R.id.constraint);
        }
    }
}
