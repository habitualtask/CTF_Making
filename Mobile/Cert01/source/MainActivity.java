package com.example.cert01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("로그인");
        Button login_loginbtn = findViewById(R.id.login_loginbtn);
        final EditText login_id = findViewById(R.id.login_id);
        final EditText login_pw = findViewById(R.id.login_pw);

        login_loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = login_id.getText().toString();
                final String pw = login_pw.getText().toString();
                if(id.equals("")||pw.equals("")){
                    Toast.makeText(getApplicationContext(),"입력해주세요",Toast.LENGTH_SHORT).show();
                }else if(id.equals("habitualtask")&&pw.equals("ksat_lautibah")){
                    Toast.makeText(getApplicationContext(),getString(R.string.answer),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"~return back~",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}