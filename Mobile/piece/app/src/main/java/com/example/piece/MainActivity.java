package com.example.piece;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public long i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button up=(Button)findViewById(R.id.up);
        Button down=(Button)findViewById(R.id.down);
        final TextView layer=(TextView)findViewById(R.id.layer);
        final ImageView ele = (ImageView)findViewById(R.id.elevator);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=i+1;
                if(i==2){
                    ele.setImageResource(R.drawable.open_elevator);
                    layer.setText(String.valueOf(i));
                }
                else{
                    ele.setImageResource(R.drawable.close_elevator);
                    layer.setText(String.valueOf(i));
                }
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=i-1;
                if (i == -2147483647){
                    ele.setImageResource(R.drawable.open_elevator);
                    layer.setText(String.valueOf(i));
                }else{
                    ele.setImageResource(R.drawable.close_elevator);
                    layer.setText(String.valueOf(i));
                }
            }
        });
    }
}