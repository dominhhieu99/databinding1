package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityRegisterStep3Binding;
import com.example.databinding.databinding.ActivityRegisterStep4Binding;
import com.example.databinding.model.RegisterStep3;
import com.example.databinding.model.RegisterStep4;

public class Register_Step4_Activity extends AppCompatActivity {
    private RegisterStep4 registerStep4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_register__step3_);
        Toast.makeText(this, "Register4", Toast.LENGTH_SHORT).show();
        ActivityRegisterStep4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step4_);
        registerStep4 = new RegisterStep4("Let's get started", "Never a better time than now to start thinking about how are manage all your finances whithease", "Creat Acount", "Log in");
        binding.setRegisterStep4(registerStep4);
    }

    public void register4(View view) {
        Intent intent = new Intent(Register_Step4_Activity.this, Register_Step3_Activity.class);
        startActivity(intent);
    }
}
