package com.example.ibm;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText edtTen = (EditText) findViewById(R.id.edtTen);
		final EditText edtChieucao = (EditText) findViewById(R.id.edtChieucao);
		final EditText edtCannang = (EditText) findViewById(R.id.edtCannang);
		final EditText edtBMI = (EditText) findViewById(R.id.edtBMI);
		final EditText edtChuandoan = (EditText) findViewById(R.id.edtChuandoan);
		
		Button btnTinh = (Button) findViewById(R.id.btnTinh);
		btnTinh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double H = Double.parseDouble(edtChieucao.getText()+"");
				double W = Double.parseDouble(edtCannang.getText()+"");
				double BMI = W/Math.pow(H, 2);
				
				String chuandoan = "";
				if(BMI <18 )
				{
					chuandoan = "Bạn gầy ";
				}
				else
					if(BMI <=24.9)
					{
						chuandoan = "Bạn bình thường";
					}
					else
						if( BMI <= 29.9)
						{
							chuandoan ="Béo phì mức độ 1";
						}
						else
							if( BMI <= 34.9)
							{
								chuandoan ="Béo phì mức độ 2";
							}
							else
								{
									chuandoan ="Béo phì mức độ 3";
								}
				DecimalFormat dcf =new DecimalFormat("#.0");
				edtBMI.setText(dcf.format(BMI));
				edtChuandoan.setText(chuandoan);

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
