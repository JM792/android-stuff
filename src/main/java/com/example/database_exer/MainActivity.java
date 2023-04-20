package com.example.database_exer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private EditText edtName, edtAge;
    private RecyclerView recView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = findViewById(R.id.btnAdd);
        edtName =findViewById(R.id.edtName);
        edtAge = findViewById(R.id.edtAge);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: press button, store data into data bank
                try{
                    Customer customer = new Customer(1,edtName.getText().toString(), Integer.parseInt(edtAge.getText().toString()));
                    Toast.makeText(MainActivity.this, "Successfully added a customer", Toast.LENGTH_SHORT).show();

                } catch(Exception e){
                    Toast.makeText(MainActivity.this, "Wrong input, can't be forwarded to the database", Toast.LENGTH_SHORT).show();
                }

                DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);



            }
        });




    }
}