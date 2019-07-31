package com.example.databinding.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.databinding.GiftAdapter;
import com.example.databinding.R;
import com.example.databinding.model.Gift;

import java.util.ArrayList;
import java.util.List;

public class GiftActivity extends AppCompatActivity {
    RecyclerView rvList;
    List<Gift> giftList;
    GiftAdapter adapter;
    ProgressDialog progressBar;

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
        giftList.add(new Gift(R.drawable.home7a, "abc"));
        giftList.add(new Gift(R.drawable.home7d, "abc"));
        giftList.add(new Gift(R.drawable.home7c, "abc"));
        giftList.add(new Gift(R.drawable.home7d, "abc"));
        giftList.add(new Gift(R.drawable.e_shopping, "abc"));
        giftList.add(new Gift(R.drawable.cash_black, "abc"));
        giftList.add(new Gift(R.drawable.send_gift, "abc"));
        giftList.add(new Gift(R.drawable.home7a, "abc"));
        giftList.add(new Gift(R.drawable.home7d, "abc"));
        giftList.add(new Gift(R.drawable.home7c, "abc"));
        giftList.add(new Gift(R.drawable.home7d, "abc"));
        giftList.add(new Gift(R.drawable.e_shopping, "abc"));
        giftList.add(new Gift(R.drawable.cash_black, "abc"));
        giftList.add(new Gift(R.drawable.send_gift, "abc"));
    }

    public void btnOnclikSendgift(View view) {
        progressBar = new ProgressDialog(GiftActivity.this);
        // Cho phép hủy progressBar nếu ấn nút Back
        progressBar.setCancelable(true);
        // Đặt tiêu đề cho ProgressBar
        progressBar.setMessage("Đang xử lý, vui lòng đợi...");
        // Đặt giao diện cho ProgressBar
        progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        // Đặt giá trị đầu tiên, đây là giá trị thể hiện mức độ hoàn thành công
        // việc có thang từ 0 - > 100
        // do hiện tại công việc chưa hoàn thành được chút nào nên ta đặt là 0
        progressBar.setProgress(0);
        // Đặt cho giá trị lớn nhất thể hiện mức độ hoàn thành công việc là 100
        progressBar.setMax(100);
        // Hiện ProgressBar
        progressBar.show();
        // Tạo một luồng xử lý công việc.
        new MyThread().start();
    }

    class MyThread extends Thread {

        @Override
        public void run() {
            // xử lý công việc cần hoàn thành
            for (int i = 0; i < 10; i++) {
                // Tạm dừng 1s, thực tế thì chỗ này là xử lý công việc
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // tính xem công việc đã hoàn thành bao nhiêu phần trăm và đưa lên progressbar
                progressBar.setProgress((i * 100) / 10);
            }
            // đóng brogressbar.
            progressBar.dismiss();
            Intent intent = new Intent(GiftActivity.this, SendGiftActivity.class);
            startActivity(intent);
        }
    }
}
