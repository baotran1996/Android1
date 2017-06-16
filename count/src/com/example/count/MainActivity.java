package com.example.count;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	
	TextView    txtCount;
	RadioButton btnUp, btnDown;
	Button      btnCount;
	int count = 0; // counter value
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnUp   = (RadioButton) findViewById(R.id.rbt1);
        btnDown = (RadioButton) findViewById(R.id.rbt2);
        txtCount = (TextView)    findViewById(R.id.txtcount);
        txtCount.setText(String.valueOf(count));
        
        btnCount = (Button) findViewById(R.id.btn1);
        
        btnCount.setOnClickListener(new OnClickListener() {
			
		
        	public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(btnUp.isChecked())
				{
					count ++;
				}
				else if(btnDown.isChecked())
				{
					count --;
				}
				txtCount.setText(String.valueOf(count));
			}
		});
        
       
        
        
        
        
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
