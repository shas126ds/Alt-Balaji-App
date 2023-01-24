package com.seeksolution.altbalaji.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.TrendingModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.logging.LogRecord;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.MyView> {

    public Context context;
    public ArrayList<TrendingModel> arrayList;

    //ArrayList<TrendingModel> arrayList
    public TrendingAdapter(Context context,ArrayList<TrendingModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mycustom_layout_trending_list,parent,false);
        return new MyView(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyView holder, @SuppressLint("RecyclerView") int position) {

        final int i = position;

        holder.imageView.setVisibility(View.GONE); // Original => gone
        holder.simmer_imageview.setVisibility(View.VISIBLE);  // grey => visible
        holder.shimmerFrameLayout.startShimmer();

       new Handler().postDelayed(new Runnable()
       {
           public void run(){
               Picasso.get().load(Uri.parse(arrayList.get(i).getImageUrls())).into(holder.imageView);

               holder.shimmerFrameLayout.hideShimmer();
               holder.simmer_imageview.setVisibility(View.GONE);
               holder.imageView.setVisibility(View.VISIBLE);
           }
       },5000);
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyView extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public ShimmerFrameLayout shimmerFrameLayout;
        public ImageView simmer_imageview;
        public MyView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_trending_list);
            shimmerFrameLayout = itemView.findViewById(R.id.iv_trending_list_shimmer_conatainer);
            simmer_imageview =itemView.findViewById(R.id.iv_trending_simmer);

            imageView.setOnClickListener(this);


        }
        @Override
        public void onClick(View view) {
            Toast.makeText(context.getApplicationContext(), "Item Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
