package com.meroapp.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Capital extends AppCompatActivity {

    private TextView textViewCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        textViewCapital=findViewById(R.id.textViewCapital);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String capital =bundle.getString("capital");
            textViewCapital.setText(capital);
        }else {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }


    }
}
