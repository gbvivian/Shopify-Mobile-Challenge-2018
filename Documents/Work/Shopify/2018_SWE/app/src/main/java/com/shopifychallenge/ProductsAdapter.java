package com.shopifychallenge;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shopifychallenge.json.Products;

import java.util.List;


public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder>{
    private List<Products> productsList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements LoadImageTask.Listener {
        public TextView title, description;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            image = (ImageView) view.findViewById(R.id.image_view);
            description = (TextView) view.findViewById(R.id.description);
        }

        @Override
        public void onImageLoaded(Bitmap bitmap) {
            image.setImageBitmap(bitmap);
        }

        @Override
        public void onError() {
        }
    }


    public ProductsAdapter(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Products product = productsList.get(position);
        holder.title.setText(product.getTitle());
        holder.description.setText(product.getBody_html());

        new LoadImageTask(holder).execute(product.getImage().getSrc());
    }


    @Override
    public int getItemCount() {
        return productsList.size();
    }

}
