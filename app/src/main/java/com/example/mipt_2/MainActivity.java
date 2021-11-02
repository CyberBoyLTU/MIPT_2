package com.example.mipt_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner countTypeSpinner;
    private EditText textInput;
    private TextView countResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.countTypeSpinner = findViewById(R.id.countTypeSpinner);
        this.textInput = findViewById(R.id.textInput);
        this.countResult = findViewById(R.id.countResult);
    }

    public void btnClick(View view) {
        String enteredUserText = this.textInput.getText().toString();
        String selectedOption = this.countTypeSpinner.getSelectedItem().toString();


        if (Counter.getCharsCount(enteredUserText) == 0){
            Toast.makeText(getApplicationContext(),"Enter text first!",Toast.LENGTH_SHORT).show();
        }
        else{
            int wordsCount = Counter.getCount(enteredUserText, selectedOption);
            this.countResult.setText("Counted: " + String.valueOf(wordsCount));
        }
    }
}