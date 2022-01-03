package CustomAdaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import Customcalss.ShowMyicon;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {

    Context context;

    ArrayList<ShowMyicon>arrayList;

    public Myadapter(Context context, ArrayList<ShowMyicon> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //this function return view

        View v = LayoutInflater.from(context).inflate(R.layout.sample_listview,parent,false);

        return new Myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        ShowMyicon showMyicon = arrayList.get(position);
        holder.textView.setText(showMyicon.name);
        holder.imageView.setImageResource(showMyicon.imagesid);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.imageText);

            imageView = itemView.findViewById(R.id.imageid);

        }
    }
}
