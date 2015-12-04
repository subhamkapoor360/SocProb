package com.kapoor360.subham.socprob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bRegister,bLogin;
    EditText use,pas;
    TextView incpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bRegister=(Button)findViewById(R.id.bRegister);
        use=(EditText)findViewById(R.id.etUsername);
        pas=(EditText)findViewById(R.id.etPassword);
        incpa=(TextView)findViewById(R.id.incpass);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),Register.class));
            }
        });
        bLogin=(Button)findViewById(R.id.bLogin);
        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String us=use.getText().toString();
                String pa=pas.getText().toString();
                int k=0;
                for(k=0;k<regasuser.i;k++)
                {
                    if(!us.equalsIgnoreCase(regasuser.userarray.get(k)))
                        continue;
                    if(us.equalsIgnoreCase(regasuser.userarray.get(k)))
                    {
                        if(pa.equalsIgnoreCase(regasuser.passarray.get(k)))
                        {
                            Intent intent =new Intent(getBaseContext(),Home.class);
                            intent.putExtra("message",us);
                            startActivity(intent);
                        }
                        else{
                            incpa.setText("Incorrect Password");
                        }
                    }
                }

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
