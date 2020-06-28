package uet.se.assignment_recycleview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    List<Model> mylist;
    Context mContext;
    private static final String TAG = "RecyclerViewAdapter";

    public RecyclerViewAdapter(List<Model> mylist, Context mContext) {
        this.mylist = mylist;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Model model = mylist.get(position);
        final String company_name = model.getCname();

        holder.cname.setText(model.getCname());

        holder.image.setImageDrawable(mContext.getResources().getDrawable(model.getImage()) );
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Screen2.class);
                intent.putExtra("c_name", company_name);
                Log.d(TAG, "company name is "+company_name);
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView cname;
        LinearLayout parentLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.company_image);
            cname = itemView.findViewById(R.id.company_name);
            parentLayout = (LinearLayout) itemView.findViewById(R.id.parent_layout);

        }
    }
}
