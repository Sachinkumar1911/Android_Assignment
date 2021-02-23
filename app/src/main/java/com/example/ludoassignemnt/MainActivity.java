package com.example.ludoassignemnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView leftdie= findViewById(R.id.left_dice);
        ImageView Rightdie=findViewById(R.id.Right_dice);
        Button high=findViewById(R.id.button);
        Button low=findViewById(R.id.button2);
        TextView res=findViewById(R.id.Result);
        ImageView emoji_res=findViewById(R.id.emoji);


       final  int[] dice={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int leftrand=rand.nextInt(6);
                int rightrand=rand.nextInt(6);



                leftdie.setImageResource(dice[leftrand]);
                Rightdie.setImageResource(dice[rightrand]);
                if(leftrand>rightrand){
                        res.setText("User Wins");
                        emoji_res.setImageResource(R.drawable.uw);
                }
                else if(leftrand==rightrand){
                    res.setText("Match Tied");
                    emoji_res.setImageResource(R.drawable.eq);
                }
                else{
                    res.setText("Computer Wins");
                    emoji_res.setImageResource(R.drawable.cwin);
                }
            }
        });
        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int leftrand=rand.nextInt(6);
                int rightrand=rand.nextInt(6);
                String com="Computer Wins";
                leftdie.setImageResource(dice[leftrand]);
                Rightdie.setImageResource(dice[rightrand]);
                if(leftrand<rightrand){
                    res.setText("User Wins");
                    emoji_res.setImageResource(R.drawable.uw);
                }
                else if(leftrand==rightrand){
                    res.setText("Match Tied");
                    emoji_res.setImageResource(R.drawable.eq);

                }
                else{
                    res.setText("Computer Wins");
                    emoji_res.setImageResource(R.drawable.cwin);
                }
            }
        });
    }
}