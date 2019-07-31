package com.example.databinding.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityRegisterStep2Binding;
import com.example.databinding.model.RegisterStep2;


public class RegisterStep2Activity extends AppCompatActivity {
    private RegisterStep2 registerStep2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register__step2_);
        Toast.makeText(this, "Register2", Toast.LENGTH_SHORT).show();
        ActivityRegisterStep2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step2_);
        registerStep2 = new RegisterStep2("Step 2/4", "Verification", "Enter 4 digit number that sent to phone number.", "Continue");
        binding.setRegisterStep2(registerStep2);
    }

    public void onContinueClickListener2(View view) {
        Intent intent = new Intent(RegisterStep2Activity.this, RegisterStep3Activity.class);
        startActivity(intent);
    }

    public void onBackClickListener2(View view) {
        Intent intent = new Intent(RegisterStep2Activity.this, RegisterStep1Activity.class);
        startActivity(intent);
    }
}
