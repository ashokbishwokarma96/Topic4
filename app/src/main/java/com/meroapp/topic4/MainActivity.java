package com.meroapp.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listViewCountries;
    public static final String countries[] = {

            "Nepal","Kathmandu",
            "India","New Dehli",
            "China","Beijing"
    };

    private Map<String ,String> dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewCountries = findViewById(R.id.listViewCountries);


        dictionary = new HashMap<>();
        for (int i=0;i<countries.length;i+=2){
            dictionary.put(countries[i],countries[i+1]);
        }

        ArrayAdapter countryAdapter = new ArrayAdapter<>(

                this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(dictionary.keySet())
        );
        listViewCountries.setAdapter(countryAdapter);

        listViewCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String country = adapterView.getItemAtPosition(i).toString();
                String capital = dictionary.get(country);
                Toast.makeText(MainActivity.this,capital.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
