package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityRegisterStep3Binding;
import com.example.databinding.model.RegisterStep3;

public class Register_Step3_Activity extends AppCompatActivity {
    private RegisterStep3 registerStep3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_register__step3_);
        Toast.makeText(this, "Register3", Toast.LENGTH_SHORT).show();
        ActivityRegisterStep3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step3_);
        registerStep3 = new RegisterStep3("Let's get started", "Never a better time than now to start thinking about how are manage all your finances whithease", "Creat Acount", "Log in");
        binding.setRegisterStep3(registerStep3);
    }

    public void register3(View view) {
        Intent intent = new Intent(Register_Step3_Activity.this, Register_Step4_Activity.class);
        startActivity(intent);
    }
}
