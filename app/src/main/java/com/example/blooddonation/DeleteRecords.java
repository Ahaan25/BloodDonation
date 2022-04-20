package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteRecords extends AppCompatActivity {

    EditText eid;
    Button delete, home;
    DBHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_records);

        db=new DBHandler(DeleteRecords.this);

        eid=findViewById(R.id.editTextTextPersonName3);
        String id=eid.getText().toString();


        delete=findViewById(R.id.button7);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    db.deletedetails(id);
                    Toast.makeText(DeleteRecords.this, "Deleted the entry.", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(DeleteRecords.this, MainActivity.class);
                    startActivity(i);
            }
        });

        home=findViewById(R.id.button12);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DeleteRecords.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

}