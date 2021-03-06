package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    public CustomGoodsAdapter() {
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);
        TextView tvName = convertView.findViewById(R.id.textView);
        TextView tvShopName = convertView.findViewById(R.id.textView2);
        ImageView imgGoods = convertView.findViewById(R.id.imageView);
        //
        tvName.setText(arrayList.get(position).getName());
        tvShopName.setText(arrayList.get(position).getShopName());
        imgGoods.setImageResource(arrayList.get(position).getImage());
        return convertView;
    }
}
