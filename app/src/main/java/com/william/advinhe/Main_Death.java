package com.william.advinhe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class Main_Death extends AppCompatActivity implements View.OnClickListener
{
    private Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death);

        //retirar o action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        restart = findViewById(R.id.rtnBtn);
        restart.setOnClickListener(this);
    }

    public void onBackPressed()
    {
        //aqui caso pressione o voltar ira para tela principal
        Intent returns = new Intent(Main_Death.this, Main_Title.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_Death.this, returns, acOption.toBundle());
        finish();
    }

    @Override
    public void onClick(View v)
    {
        Intent returns = new Intent(Main_Death.this, Main_Title.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_Death.this, returns, acOption.toBundle());
        finish();
    }
}