package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.databinding.GiftAdapter;
import com.example.databinding.R;
import com.example.databinding.model.Gift;

import java.util.ArrayList;
import java.util.List;

public class GiftActivity extends AppCompatActivity {
    RecyclerView rvList;
    List<Gift> giftList;
    GiftAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);

        rvList = findViewById(R.id.rvList);
        giftList = new ArrayList<>();
        adapter = new GiftAdapter(giftList);
        rvList.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvList.setLayoutManager(manager);

        fakeData();
    }

    private void fakeData() {
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));
        giftList.add(new Gift(R.drawable.charity, "abc"));


    }
}
