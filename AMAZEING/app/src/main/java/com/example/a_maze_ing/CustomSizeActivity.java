package com.example.a_maze_ing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomSizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_size);
    }

    public void play(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editTextRows = findViewById(R.id.editText);
        EditText editTextCols = findViewById(R.id.editText2);
        int [] mazeSize = new int [2];
        /* rows */
        mazeSize[0] = Integer.parseInt(editTextRows.getText().toString());
        /* columns */
        mazeSize[1] = Integer.parseInt(editTextCols.getText().toString());
        intent.putExtra("mazeSize", mazeSize);
        startActivity(intent);
    }
}
