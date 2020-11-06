package br.com.fazenTech.cursoandroid.fazenTech.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.fazenTech.cursoandroid.fazenTech.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirAutenticacao();
            }
        }, 3000);

    }

    private void abrirAutenticacao(){
        Intent i = new Intent(SplashActivity.this, AutenticacaoActivity.class);
        startActivity(i);
        finish();
    }

}
