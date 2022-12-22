package com.abmtech.medicalmanagement.Welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.abmtech.medicalmanagement.R;
import com.abmtech.medicalmanagement.User.HomeUserActivity;
import com.abmtech.medicalmanagement.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    SignUpActivity activity;
    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        activity = this;

        binding.goToSignup.setOnClickListener(v -> {
            startActivity(new Intent(activity, LoginActivity.class));
            finish();
            finishAffinity();
        });

        binding.loginBtn.setOnClickListener(v -> showDialog());

    }

    private void showDialog() {
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.signup_dialog_layout);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;


        LinearLayout layout = dialog.findViewById(R.id.home);

        layout.setOnClickListener(v -> {
            startActivity(new Intent(activity, LoginActivity.class));
            finish();
        });

        dialog.show();

    }
}