package com.manes.nikolas.memorygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner sizeSpinner;
    private Spinner difficultySpinner;
    public String gameSize;
    public String gameDifficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sizeSpinner = (Spinner)findViewById(R.id.size_spinner);
        difficultySpinner = (Spinner)findViewById(R.id.difficulty_spinner);

        // Create 2 ArrayAdapters using the string arrays and a default spinner layout
        ArrayAdapter<CharSequence> sizeAdapter = ArrayAdapter.createFromResource(this,
                R.array.game_size, R.layout.custom_spinner_item);
        ArrayAdapter<CharSequence> difficultyAdapter = ArrayAdapter.createFromResource(this,
                R.array.difficulty, R.layout.custom_spinner_item);

        // Specify the layout to use when the list of choices appears
        sizeAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);
        difficultyAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);

        // Apply the adapters to the spinners
        sizeSpinner.setAdapter(sizeAdapter);
        difficultySpinner.setAdapter(difficultyAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
