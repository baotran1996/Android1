package com.example.thuchanh_listview;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnItemClickListener, OnItemLongClickListener {

	
	ListView liTen;
	TextView txtTen;
	 ArrayList<String> list;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       liTen = (ListView)findViewById(R.id.listViewTen);
       
        list = new ArrayList<String>();
       list.add("Pham Ngoc Trung");
       list.add("Pham Ngoc Tuan");
       list.add("Tran Ngoc Tho");
       list.add("Nguyen Minh Tien");
       list.add("Cao Viet Thang");
       list.add("Dao Khac Vi");
        
        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        
        
        liTen.setAdapter(adpter);
        liTen.setOnItemClickListener(this);
        liTen.setOnItemLongClickListener(this);
        
        
        
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


	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		Dialog dialog = new Dialog(this);
		dialog.setTitle(list.get(arg2));
		dialog.show();
		
		
		return false;
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		Toast.makeText(this, list.get(arg2), Toast.LENGTH_SHORT).show();
		
		
	}
}
