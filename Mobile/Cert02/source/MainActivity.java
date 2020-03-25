package com.example.cert02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Cert02");
        Button button=findViewById(R.id.button2);
        final EditText text1=findViewById(R.id.textView4);
        final EditText text2=findViewById(R.id.textView5);
        final EditText text3=findViewById(R.id.textView6);
        final String Kang="kimhanggon";//url
        final String Min="leejonghak";//url
        final String Song="choyonghyun";//base64

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String A=text1.getText().toString();
                final String B=text2.getText().toString();
                final String C=text3.getText().toString();
                if(A.equals("")||B.equals("")||C.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요",Toast.LENGTH_SHORT).show();
                }else if(Kang.equals(URL(A))&&Min.equals(URL(B))&&Song.equals(BASE(C))){
                    Toast.makeText(getApplicationContext(),getString(R.string.key),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"돌아가세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public static String BASE(String content) {
        try {
            return new String(Base64.decode(content, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String URL(String content){
        try {
            return URLDecoder.decode(content, "euc-kr");  // EUC-KR
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}