package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView textView;
   Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        String Text = "Where would you like\n to go today?";
        SpannableString str = new SpannableString(Text);
        str.setSpan(new StyleSpan(Typeface.BOLD),27 ,Text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(str);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(view.getContext(),booking.class);
                startActivity(i);
            }
        });
    }
}