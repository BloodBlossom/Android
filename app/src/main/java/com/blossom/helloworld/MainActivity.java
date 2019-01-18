package com.blossom.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    public int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Switch switch1 = findViewById(R.id.switch1);
        final TextView textView = findViewById(R.id.textView2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText1);
                textView.setText(editText.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               TextView text1 = findViewById(R.id.textView5);
               num = num+1;
               text1.setText(Integer.toString(num));
            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView text2 = findViewById(R.id.textView6);
                if(isChecked){
                    text2.setText(R.string.anonymous);
                }
                else{
                    text2.setText(R.string.myname);
                }
            }
        });
    }
}
