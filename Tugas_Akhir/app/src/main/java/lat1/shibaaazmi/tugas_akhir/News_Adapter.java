package lat1.shibaaazmi.tugas_akhir;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class News_Adapter extends ArrayAdapter<String> {
    Context context;
    String[] listjudul_news;
    String[] listringkasan_news;
    int[] listgambar;
    String[] urls;

    public News_Adapter(Context context, String[] listjudul_news, String[] listringkasan_news, int[] listgambar, String[] urls) {
        super(context, R.layout.item_news, R.id.tvnameNews, listjudul_news);
        this.context = context;
        this.listjudul_news = listjudul_news;
        this.listringkasan_news = listringkasan_news;
        this.listgambar = listgambar;
        this.urls = urls;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View itemnews = convertView;
        News_Holder holder = null;

        if (itemnews == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemnews = layoutInflater.inflate(R.layout.item_news, parent, false);
            holder = new News_Holder(itemnews);
            itemnews.setTag(holder);
        } else {
            holder = (News_Holder) itemnews.getTag();
        }
        holder.itemImage.setImageResource(listgambar[position]);
        holder.newsTitle.setText(listjudul_news[position]);
        holder.newsDescription.setText(listringkasan_news[position]);
        itemnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                context.startActivity(openLinksIntent);
            }
        });
        return itemnews;
    }
}
