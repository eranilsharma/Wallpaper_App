package com.android.wallpaperapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.wallpaperapp.R;
import com.android.wallpaperapp.activities.allImageActivity;
import com.android.wallpaperapp.model.MainCategoryImagesModel;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Sharma Ji on 18-Feb-18.
 */

public class MainCategoryDataAdapter extends RecyclerView.Adapter<MainCategoryDataAdapter.ViewHolder> {

    private ArrayList<MainCategoryImagesModel> categoryImagesModels;
    private Context context;

    public MainCategoryDataAdapter(Context context, ArrayList<MainCategoryImagesModel> categoryImages) {
        this.categoryImagesModels = categoryImages;
        this.context = context;
    }

    @Override
    public MainCategoryDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_category_recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainCategoryDataAdapter.ViewHolder holder, final int position) {
        holder.tv_catrgory_name.setText(categoryImagesModels.get(position).getCategory_name());
        Picasso.with(context).load(categoryImagesModels.get(position).getCategory_image_url()).placeholder(R.drawable.loading_image).into(holder.img_category_image);
        holder.img_category_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,allImageActivity.class);
                intent.putExtra("category",categoryImagesModels.get(position).getCategory_name());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categoryImagesModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_catrgory_name;
        private ImageView img_category_image;

        public ViewHolder(View view) {
            super(view);

            tv_catrgory_name = (TextView) view.findViewById(R.id.txt_category_name);
            img_category_image = (ImageView ) view.findViewById(R.id.img_categoryimage);
        }
    }
}
