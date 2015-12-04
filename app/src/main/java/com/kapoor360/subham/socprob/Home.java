package com.kapoor360.subham.socprob;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by Subham on 9/13/2015.
 */
public class Home extends Activity{
    Button problem,donate,own;
    ImageButton li;
    Button bt;
    TextView pr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        TextView t = (TextView)findViewById(R.id.usern);
        pr=(TextView)findViewById(R.id.prt);
        own=(Button)findViewById(R.id.owned);
        bt=(Button)findViewById(R.id.btn);
        li=(ImageButton)findViewById(R.id.link);
        Intent intent=getIntent();
        String message= intent.getStringExtra("message");
        t.setText(message);
        problem=(Button)findViewById(R.id.problem);
        donate=(Button)findViewById(R.id.donate);
        problem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),NewProblem.class));
            }
        });
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),Donate.class));
            }
        });
        own.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),Tp.class));
            }
        });
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),Cproblem.class));
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pr.setText("1");
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




