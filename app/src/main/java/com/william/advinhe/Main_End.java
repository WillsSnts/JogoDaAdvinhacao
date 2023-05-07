package com.william.advinhe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_End extends AppCompatActivity implements View.OnClickListener
{
    public Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        restart = findViewById(R.id.rstBtn);
        restart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        //aqui caso pressione o voltar ira para tela principal
        Intent returns = new Intent(Main_End.this, Main_Title.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_End.this, returns, acOption.toBundle());
        finish();
    }
    @Override
    public void onBackPressed()
    {
        //aqui caso pressione o voltar ira para tela principal
        Intent returns = new Intent(Main_End.this, Main_Title.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_End.this, returns, acOption.toBundle());
        finish();
    }
}