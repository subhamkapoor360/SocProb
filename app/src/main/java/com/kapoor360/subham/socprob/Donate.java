package com.kapoor360.subham.socprob;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Subham on 9/13/2015.
 */
public class Donate extends Activity{

    Button sbm;
    EditText ed;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate);
        sbm=(Button)findViewById(R.id.btnSubmit);
        ed=(EditText)findViewById(R.id.etAmount);
        t=(TextView)findViewById(R.id.display);

        sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText("You have donated Rs"+ed.getText().toString());

            }
        });
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
}



