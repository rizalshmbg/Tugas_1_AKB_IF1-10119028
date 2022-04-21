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
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Register(View view) {
        Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}