package com.kapoor360.subham.socprob;

/**
 * Created by Subham on 9/13/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class regasuser extends Activity implements View.OnClickListener {
    Button registerUser;
    EditText user,pass;
    public static ArrayList<String> userarray = new ArrayList<>();
    public static ArrayList<String> passarray = new ArrayList<>();
    public static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeruser);
        registerUser=(Button)findViewById(R.id.registerUser);
        user=(EditText)findViewById(R.id.etUsername);
        pass=(EditText)findViewById(R.id.etPassword);
        registerUser=(Button)findViewById(R.id.registerUser);
        registerUser.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.registerUser:
                String use=user.getText().toString();
                String pas=pass.getText().toString();
                userarray.add(use);
                passarray.add(pas);
                i++;
                startActivity(new Intent(getBaseContext(),MainActivity.class));
                break;
        }


    }
}


