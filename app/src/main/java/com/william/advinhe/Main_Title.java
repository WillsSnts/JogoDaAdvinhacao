package com.william.advinhe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import java.util.Objects;

public class Main_Title extends AppCompatActivity implements View.OnClickListener
{
    private Button start;

    //define o tempo para pressionat botao fechar
    private long tempoFechar;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_titulo);//inicial
//            setContentView(R.layout.activity_game); //jogo

            start = findViewById(R.id.startBtn);

            //retirar o action bar
            Objects.requireNonNull(getSupportActionBar()).hide();

            start.setOnClickListener(this);
        }


    @Override
    public void onClick(View v) {
            //chamar outra activity
        Intent intent = new Intent(Main_Title.this, Main_Game.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_Title.this, intent, acOption.toBundle());
    }




    @Override
    public void onBackPressed()
    {

        if (tempoFechar + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Pressione voltar mais uma vez para sair",
                    Toast.LENGTH_SHORT).show();
        }
        tempoFechar = System.currentTimeMillis();
        finish();
    }
}
