package com.meroapp.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewCountries;
    public static final String countries[] = {"Nepal","India","China"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewCountries = findViewById(R.id.listViewCountries);

        ArrayAdapter countryAdapter = new ArrayAdapter<>(

                this,
                android.R.layout.simple_list_item_1,
                countries
        );
        listViewCountries.setAdapter(countryAdapter);


    }
}
