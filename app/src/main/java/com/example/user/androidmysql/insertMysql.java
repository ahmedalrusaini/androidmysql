package com.example.user.androidmysql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class insertMysql extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_mysql);



    }


    public void insertuser(View view) {

        EditText newUser=(EditText)findViewById(R.id.id_mysql_insert_newuser);

        String newUserString=newUser.getText().toString().trim();

        

    }
}
