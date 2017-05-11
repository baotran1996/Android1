package com.example.tong2so;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		EditText edita,editb;
		Button btntong2so;  
	}
		public void btn_tong2so (View v) {
			EditText edita = (EditText) findViewById(R.id.editorSoA);
			int a = Integer.parseInt(edita.getText()+"");
			
			EditText editb = (EditText) findViewById(R.id.editorSoB);
			int b = Integer.parseInt(editb.getText()+"");
			
			TextView txtKQ = (TextView)findViewById(R.id.txtKQ);
			txtKQ.setText((a+b)+"");
			
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
