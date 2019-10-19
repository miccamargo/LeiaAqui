package com.example.leiaaqui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImageButton = (ImageButton) findViewById(R.id.imageButtonLogo);

        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_LONG).show();
            }
        });


    }

}
