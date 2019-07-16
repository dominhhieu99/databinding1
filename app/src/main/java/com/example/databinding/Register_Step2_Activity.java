package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityRegisterStep2Binding;
import com.example.databinding.model.RegisterStep2;

public class Register_Step2_Activity extends AppCompatActivity {
    private RegisterStep2 registerStep2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register__step2_);
        Toast.makeText(this, "Register2", Toast.LENGTH_SHORT).show();
        ActivityRegisterStep2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step2_);
        registerStep2 = new RegisterStep2("Let's get started", "Never a better time than now to start thinking about how are manage all your finances whithease", "Creat Acount", "Log in");
        binding.setRegisterStep2(registerStep2);

    }

    public void register2(View view) {
        Intent intent = new Intent(Register_Step2_Activity.this, Register_Step3_Activity.class);
        startActivity(intent);
    }
}
