package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityRegisterStep1Binding;
import com.example.databinding.model.RegisterStep1;

public class RegisterStep1Activity extends AppCompatActivity {
    private RegisterStep1 registerStep1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegisterStep1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step1_);
        registerStep1 = new RegisterStep1("Step 1/4", "Registration", "Enter your number, we will send you OTP to verify later", "Continue");
        binding.setRegisterStep1(registerStep1);
        Toast.makeText(this, "Register1", Toast.LENGTH_SHORT).show();
    }

    public void onContinueClick1(View view) {
        Intent intent = new Intent(RegisterStep1Activity.this, RegisterStep2Activity.class);
        startActivity(intent);
    }

    public void onBackClickListener1 (View view) {
        Intent intent = new Intent(RegisterStep1Activity.this, MainActivity.class);
        startActivity(intent);
    }
}