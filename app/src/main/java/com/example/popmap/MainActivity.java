package com.example.popmap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

//Registrācija
    public void onBtnClick (View view)  {
        TextView txtHello = findViewById(R.id.txtMessage);
        EditText editTxtName = findViewById(R.id.editTxtName);
        txtHello.setText("Hello " + editTxtName.getText().toString());
    }
}