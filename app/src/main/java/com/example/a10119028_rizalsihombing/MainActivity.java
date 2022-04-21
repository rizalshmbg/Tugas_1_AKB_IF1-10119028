/*  IDENTITAS DIRI
 *  Tanggal Pengerjaan : Kamis, 21 April 2022
 *  NIM : 10119028
 *  NAMA : Rizal Sihombing
 *  KELAS : IF-1
 */

package com.example.a10119028_rizalsihombing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.logo);
        imageView.animate().alpha(1).setDuration(0);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dsp = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(dsp);
                finish();
            }
        }, 2000);
    }
}