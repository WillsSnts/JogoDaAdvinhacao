package com.william.advinhe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

public class Main_Win extends AppCompatActivity implements View.OnClickListener
{

    public ImageView imagem;
    public View layout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        //retirar o action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        imagem = findViewById(R.id.imageView);
        imagem.setOnClickListener(this);


    }

    @Override
    public void onBackPressed()
    {

    }

    @Override
    public void onClick(View v)
    {
        AnimationDrawable anim = (AnimationDrawable) imagem.getDrawable();
        Animatable animacao = anim;
        animacao.start();

        //aqui caso pressione o voltar ira para tela principal
        Intent returns = new Intent(Main_Win.this, Main_End.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_Win.this, returns, acOption.toBundle());
        finish();
    }
}