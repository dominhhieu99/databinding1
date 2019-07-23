package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityRegisterStep4Binding;
import com.example.databinding.model.RegisterStep4;

public class RegisterStep4Activity extends AppCompatActivity {
    private RegisterStep4 registerStep4;

    private Dialog dialog;
    ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_register__step3_);
        Toast.makeText(this, "Register4", Toast.LENGTH_SHORT).show();
        ActivityRegisterStep4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step4_);
        registerStep4 = new RegisterStep4("Step 4/4", "One step away to your account", "Now we need to verify your identity", "Continue");
        binding.setRegisterStep4(registerStep4);
    }

    public void onContinueClickListener4(View view) {
        showDialog();
    }

    public void onBackClickListener4(View view) {
        Intent intent = new Intent(RegisterStep4Activity.this, RegisterStep3Activity.class);
        startActivity(intent);
    }

    public void showDialog() {
        dialog = new Dialog(RegisterStep4Activity.this);
        dialog.setContentView(R.layout.dialog_register_step5);
        dialog.show();
    }

    public void Continuea(View view) {
        progressBar = new ProgressDialog(RegisterStep4Activity.this);
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
            Intent intent = new Intent(RegisterStep4Activity.this, Home1Activity.class);
            startActivity(intent);
        }
    }
}