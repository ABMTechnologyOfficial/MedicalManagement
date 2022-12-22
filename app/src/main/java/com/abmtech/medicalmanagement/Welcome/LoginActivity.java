package com.abmtech.medicalmanagement.Welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.abmtech.medicalmanagement.R;
import com.abmtech.medicalmanagement.User.HomeUserActivity;
import com.abmtech.medicalmanagement.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    LinearLayout login ;
    LoginActivity  activity;

    ActivityLoginBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        activity = this;

        binding.loginBtn.setOnClickListener(v -> showDialog() );
        binding.goToSignup.setOnClickListener(v -> startActivity(new Intent(activity,SignUpActivity.class)));

    }


    private void showDialog() {
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.login_dialog_layout);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;


        LinearLayout layout = dialog.findViewById(R.id.home);

        layout.setOnClickListener(v -> {
            startActivity(new Intent(activity, HomeUserActivity.class));
            finish();
        });

        dialog.show();

    }

}