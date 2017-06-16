package com.example.maytinh;

import android.R.integer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends ActionBarActivity {

	
	
	EditText edita , editb, kq;
	Button btnThucHien;
	RadioButton rbtCong, rbtTru, rbtNhan, rbtChia;
	int a, b;	
		
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        rbtCong = (RadioButton)findViewById(R.id.radiocong);
        rbtTru = (RadioButton)findViewById(R.id.radiotru);
        rbtNhan = (RadioButton)findViewById(R.id.radionhan);
        rbtChia = (RadioButton)findViewById(R.id.radiochia);
        
    	btnThucHien = (Button)findViewById(R.id.buttonthuchien); 	
    	
    	btnThucHien.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    					
    			edita = (EditText)findViewById(R.id.editTextsoa);
    			 a = Integer.parseInt(edita.getText().toString());   			
    			editb = (EditText)findViewById(R.id.editTextsob);  			
    			 b = Integer.parseInt(editb.getText().toString());
    			 
    			if(rbtCong.isChecked() == true)
    			{
    				kq = (EditText)findViewById(R.id.editTextkq);	
    					kq.setText(" "+(a + b));
    				
    			}
    			
    			if(rbtTru.isChecked() == true)
    			{
    				kq = (EditText)findViewById(R.id.editTextkq);
    					kq.setText(" "+(a - b));
    				
    			}
    			
    			if(rbtNhan.isChecked() == true)
    			{
    				kq = (EditText)findViewById(R.id.editTextkq);
    					kq.setText(""+(a*b));
   				
   			}
    			if(rbtChia.isChecked() == true)
    			{
    				kq = (EditText)findViewById(R.id.editTextkq);
    					kq.setText(""+ (a*1.0/b));
    				
   			}
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
