package com.example.pakstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button register,login,guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_PakStudy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();
// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        register = findViewById(R.id.signUp);
        login = findViewById(R.id.signIn);
        guest = findViewById(R.id.guestSignIn);


//        getWindow().getDecorView().setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_FULLSCREEN);

        Intent intent = new Intent(this, MainScreenActivity.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                finish();
            }
        });

        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
            }
        });


    }
}