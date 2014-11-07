package com.benjagarrido.internacional;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos nuestras variables y les asignamos valor
        final TextView factLabel = (TextView)findViewById(R.id.lblHechoCurioso);
        Button showFactButton = (Button)findViewById(R.id.btnMostrarOtro);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact ="";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(10);
                switch (randomNumber){
                    case 0:
                        fact = getResources().getString(R.string.hecho_1);
                        break;
                    case 1:
                        fact = getResources().getString(R.string.hecho_2);
                        break;
                    case 2:
                        fact = getResources().getString(R.string.hecho_3);
                        break;
                    case 3:
                        fact = getResources().getString(R.string.hecho_4);
                        break;
                    case 4:
                        fact = getResources().getString(R.string.hecho_5);
                        break;
                    case 5:
                        fact = getResources().getString(R.string.hecho_6);
                        break;
                    case 6:
                        fact = getResources().getString(R.string.hecho_7);
                        break;
                    case 7:
                        fact = getResources().getString(R.string.hecho_8);
                        break;
                    case 8:
                        fact = getResources().getString(R.string.hecho_9);
                        break;
                    case 9:
                        fact = getResources().getString(R.string.hecho_10);
                        break;
                    case 10:
                        fact = getResources().getString(R.string.hecho_11);
                        break;
                    default:
                        break;
                }

                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
