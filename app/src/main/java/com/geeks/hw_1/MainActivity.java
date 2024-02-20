package com.geeks.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.geeks.hw_1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnDone.setOnClickListener(v -> {
            //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            //startActivity(intent);
            Intent intent = new Intent();
            intent.setType("text/html");
            intent.putExtra(Intent.EXTRA_EMAIL, binding.etEmail.getText().toString());
            intent.putExtra(Intent.EXTRA_SUBJECT, binding.etTheme.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, binding.etText.getText().toString());
            startActivity(Intent.createChooser(intent, "Done"));
        });
    }
}