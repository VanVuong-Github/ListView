package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adapter;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Ao thiet ke", "Nike", R.drawable.custom_tshirt_1));
        arrayList.add(new Goods("Ao thiet ke", "Nike", R.drawable.android_mobile_app_developer));
        arrayList.add(new Goods("Ao thiet ke", "Nike", R.drawable.dev));
        arrayList.add(new Goods("Ao thiet ke", "Nike", R.drawable.download));
        arrayList.add(new Goods("Ao thiet ke", "Nike", R.drawable.computer));

        adapter = new CustomGoodsAdapter(this, R.layout.item_listview, arrayList);

        lvGoods.setAdapter(adapter);
    }
}