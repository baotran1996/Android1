package com.example.lich;

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
		
		final EditText edtNamDL = (EditText) findViewById(R.id.edtNamDL) ;
		final TextView txtNamAL = (TextView) findViewById(R.id.txtNamAL);
		Button btnDoi = (Button) findViewById(R.id.btnDoi);
		btnDoi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			int NamDL = Integer.parseInt(edtNamDL.getText()+"");
			String a[]= { "Canh", "Tân", "Nhâm", "Quý" ,"Giáp", "Ất ", "Bính","Đinh ", "Mậu"," Kỳ "};
			String b[]= {"Thân", "Dậu", "Tuất" , "Hợi"," Tý", "Sữu", "Dần"," Mẹo", "Thìn", "Tỵ" ," Ngọ"," Mùi " };
			int can, chi;
			can = NamDL % 10;
			chi = NamDL % 12 ;
			String nam = a[can]+""+ b[chi];
			
			txtNamAL.setText(nam +"");
			
			
			
				
				
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
