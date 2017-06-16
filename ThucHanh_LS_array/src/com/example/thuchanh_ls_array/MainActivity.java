package com.example.thuchanh_ls_array;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	
	ListView lsTen;
	TextView txtTen;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
	//1. Khởi tạo dữ liệu cho mảng arr (còn gọi là data source)
		
		final String arr[]=
			getResources().getStringArray(R.array.myarr);
		
		txtTen=(TextView) findViewById(R.id.textViewTen);
		lsTen =(ListView) findViewById(R.id.listViewTen);
		

		
		//3. Gán Data source vào ArrayAdapter
		
		ArrayAdapter<String>adapter=new ArrayAdapter<String>
			(this, android.R.layout.simple_list_item_1, arr);
		
		//4. Đưa Data source vào ListView
		lsTen.setAdapter(adapter);
		
		
		//5. Thiết lập sự kiện cho Listview, khi chọn phần tử nào thì hiển thị lên TextView
		lsTen.setOnItemClickListener(
				new AdapterView.OnItemClickListener() {
					public void onItemClick(AdapterView<?> arg0,
							View arg1, 
							int arg2,
							long arg3) {
				
						txtTen.setText("Lựa Chọn :"+arg2+" ; Thông Tin ="+arr[arg2]);
						
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
