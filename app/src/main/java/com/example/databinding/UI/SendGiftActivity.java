package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.databinding.R;

public class SendGiftActivity extends AppCompatActivity {

    private Dialog dialog;
    ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_gift);
        showDialog();
    }

    public void showDialog() {
        dialog = new Dialog(SendGiftActivity.this);
        dialog.setContentView(R.layout.dialog_send_gift);
        dialog.show();
    }

    public void Done(View view) {
        progressBar = new ProgressDialog(SendGiftActivity.this);
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
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                // tính xem công việc đã hoàn thành bao nhiêu phần trăm và đưa lên progressbar
                progressBar.setProgress((i * 100) / 10);
            }
            // đóng brogressbar.
            progressBar.dismiss();
            Intent intent = new Intent(SendGiftActivity.this, Home1Activity.class);
            startActivity(intent);
        }
    }
}
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        btShow = (Button) findViewById(R.id.btShow);
//        btShow.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                // Khởi tạo progressBar với đối là Context
//                progressBar = new ProgressDialog(MainActivity.this);
//                // Cho phép hủy progressBar nếu ấn nút Back
//                progressBar.setCancelable(true);
//                // Đặt tiêu đề cho ProgressBar
//                progressBar.setMessage("Đang xử lý, vui lòng đợi...");
//                // Đặt giao diện cho ProgressBar
//                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//                // Đặt giá trị đầu tiên, đây là giá trị thể hiện mức độ hoàn thành công
//                // việc có thang từ 0 - > 100
//                // do hiện tại công việc chưa hoàn thành được chút nào nên ta đặt là 0
//                progressBar.setProgress(0);
//                // Đặt cho giá trị lớn nhất thể hiện mức độ hoàn thành công việc là 100
//                progressBar.setMax(100);
//                // Hiện ProgressBar
//                progressBar.show();
//
//                // Tạo một luồng xử lý công việc.
//                new MyThread().start();
//
//            }
//        });
//
//    }
//
//class MyThread extends Thread{
//
//    @Override
//    public void run(){
//        // xử lý công việc cần hoàn thành
//        for(int i =0; i< 30; i++){
//            // Tạm dừng 1s, thực tế thì chỗ này là xử lý công việc
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//
//            // tính xem công việc đã hoàn thành bao nhiêu phần trăm và đưa lên progressbar
//            progressBar.setProgress((i * 100) / 30);
//        }
//        // đóng brogressbar.
//        progressBar.dismiss();
//    }
//}
//
//}