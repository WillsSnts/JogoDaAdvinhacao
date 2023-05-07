package com.william.advinhe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class Main_Game extends AppCompatActivity
{
    public ImageView numAdv;

    public Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
    public int[] imagens = { R.drawable.n1, R.drawable.n2, R.drawable.n3, R.drawable.n4, R.drawable.n5,
            R.drawable.n6, R.drawable.n7, R.drawable.n8, R.drawable.n9, R.drawable.n10};
    public String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public TextView tentativa, numero;
    public int numTentativa = 3;

    public String numSlc;
    public String numRsp;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //retirar o action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        numAdv = findViewById(R.id.advN);
        n1 = findViewById(R.id.btn1);
        n2 = findViewById(R.id.btn2);
        n3 = findViewById(R.id.btn3);
        n4 = findViewById(R.id.btn4);
        n5 = findViewById(R.id.btn5);
        n6= findViewById(R.id.btn6);
        n7 = findViewById(R.id.btn7);
        n8 = findViewById(R.id.btn8);
        n9 = findViewById(R.id.btn9);
        n10 = findViewById(R.id.btn10);
        tentativa = findViewById(R.id.txtNtt);
        numero = findViewById(R.id.nTxt);

        tentativa.setText(String.valueOf( numTentativa ));

        int numAl = new Random().nextInt(num.length);

//        numAdv.setImageResource(imagens[numAl]);
        numAdv.setImageResource(R.drawable.question);
        numSlc = num[numAl];

        if( numTentativa  > 0)
        {
//NUMERO 1------------------------------------------------------
            n1.setOnClickListener(v ->
            {
                numRsp = "1";
                numero.setText("1");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[0]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    numTentativa --;
                    tentativa.setText(String.valueOf( numTentativa ));
                    if( numTentativa  == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 2------------------------------------------------------
            n2.setOnClickListener(v ->
            {
                numRsp = "2";
                numero.setText("2");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[1]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 3------------------------------------------------------
            n3.setOnClickListener(v ->
            {
                numRsp = "3";
                numero.setText("3");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[2]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 4------------------------------------------------------
            n4.setOnClickListener(v ->
            {
                numRsp = "4";
                numero.setText("4");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[3]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {

                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 5------------------------------------------------------
            n5.setOnClickListener(v ->
            {
                numRsp = "5";
                numero.setText("5");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[4]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 6------------------------------------------------------
            n6.setOnClickListener(v ->
            {
                numRsp = "6";
                numero.setText("6");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[5]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {

                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 7------------------------------------------------------
            n7.setOnClickListener(v ->
            {
                numRsp = "7";
                numero.setText("7");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[6]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {

                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 8------------------------------------------------------
            n8.setOnClickListener(v ->
            {
                numRsp = "8";
                numero.setText("8");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[7]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 9------------------------------------------------------
            n9.setOnClickListener(v ->
            {
                numRsp = "9";
                numero.setText("9");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[8]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {

                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));
                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });

//NUMERO 10------------------------------------------------------
            n10.setOnClickListener(v ->
            {
                numRsp = "10";
                numero.setText("10");

                if(numRsp.equals(numSlc))
                {
                    numAdv.setImageResource(imagens[9]);
                    Intent intent = new Intent(Main_Game.this, Main_Win.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    numTentativa--;
                    tentativa.setText(String.valueOf (numTentativa));

                    if( numTentativa == 0)
                    {
                        //chamar outra activity em caso de derrota
                        Intent death = new Intent(Main_Game.this, Main_Death.class);
                        // iniciar animação
                        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                                R.anim.fade_in, R.anim.fade_out);
                        ActivityCompat.startActivity(Main_Game.this, death, acOption.toBundle());
                        finish();
                    }
                }
            });
        }
    }

    @Override
    public void onBackPressed()
    {
        //aqui caso pressione o voltar ira para tela principal
        Intent returns = new Intent(Main_Game.this, Main_Title.class);
        // iniciar animação
        ActivityOptionsCompat acOption = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(Main_Game.this, returns, acOption.toBundle());
        finish();
    }

}