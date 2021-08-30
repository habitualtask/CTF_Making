package com.example.cert05;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Arrays;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Dre=findViewById(R.id.DRe);
        Button Do=findViewById(R.id.Do);
        Button Re=findViewById(R.id.Re);
        Button Mi=findViewById(R.id.Mi);
        Button Fa=findViewById(R.id.Fa);
        Button Sol=findViewById(R.id.Sol);
        Button La=findViewById(R.id.La);
        Button Si=findViewById(R.id.Si);
        Button HDo=findViewById(R.id.HDo);
        Button HRe=findViewById(R.id.HRe);
        ImageView korea =(ImageView)findViewById(R.id.korea);
        korea.setVisibility(View.INVISIBLE);

        final char[] array_list = new char[28];
        Arrays.fill(array_list,'0');
        final String key=getString(R.string.key);
        final String key2=getString(R.string.key2);
        Dre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = 'b';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        Do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = '@';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        Re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = 'd';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        Mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = '$';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        Fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = 'a';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        Sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = '!';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        La.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = 'e';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        Si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = '*';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        HDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = 'c';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
        HRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<28;i++){
                    String list=Arrays.toString(array_list);
                    if(array_list[27] !='0' && list.equals(key2)){
                        Toast.makeText(getApplicationContext(),"iKeeper{"+key+"}",Toast.LENGTH_SHORT).show();
                    }
                    else if(array_list[27] !='0' && !list.equals(key)){
                        Toast.makeText(getApplicationContext(),"iKeeper{wrong...}",Toast.LENGTH_SHORT).show();
                        Log.d("ppppi",list);
                        Log.d("key",key2);
                        Arrays.fill(array_list,'0');
                    }
                    if(array_list[i]=='0'){
                        array_list[i] = '#';
                        char a = array_list[i];
                        Log.d("piano",String.valueOf(a));
                        break;
                    }
                }
            }
        });
    }
}