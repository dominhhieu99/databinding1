package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityRegisterStep4Binding;
import com.example.databinding.model.RegisterStep4;

public class RegisterStep4Activity extends AppCompatActivity {
    private RegisterStep4 registerStep4;

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
        Intent intent = new Intent(RegisterStep4Activity.this, Home1Activity.class);
        startActivity(intent);
    }

    public void onBackClickListener4(View view) {
        Intent intent = new Intent(RegisterStep4Activity.this, RegisterStep3Activity.class);
        startActivity(intent);
    }
}
