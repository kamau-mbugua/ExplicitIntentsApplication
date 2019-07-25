package com.example.explicitintentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    EditText etSurName;
    Button btSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        etSurName=findViewById(R.id.etSurname);
        btSubmit=findViewById(R.id.btnSubmit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           // if (etSurName.getText().toString().isEmpty());
                if(etSurName.getText().toString().isEmpty()) {
                    Toast.makeText(Activity3.this,
                            "Please Enter Some Text",
                            Toast.LENGTH_SHORT).show();  ;
                }

              //  {
                //    Toast.makeText(Activity3.this,
                  //          "Please Enter Some Text",
                    //        Toast.LENGTH_SHORT).show();
              //  }

                else
                {
                    String surname=etSurName.getText().toString().trim();

                    Intent intent=new Intent();
                    intent.putExtra("surname" ,surname);
                    setResult(RESULT_OK, intent);
                    Activity3.this.finish();
                }
            }
        });
    }
}
