package lat1.shibaaazmi.tugas_akhir;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class News_Holder {
    ImageView itemImage;
    TextView newsTitle;
    TextView newsDescription;
    public News_Holder(View v) {
        itemImage= v.findViewById(R.id.ppNews);
        newsTitle=v.findViewById(R.id.tvnameNews);
        newsDescription=v.findViewById(R.id.tvRingkasan);
    }
}
