package com.example.arraylist_listviewcontrol;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	
	 EditText txtten;
	 TextView txtchon;
	 Button btn;
	 ListView lv;
	 ArrayList<String>arrList=null;
	 ArrayAdapter<String> adapter=null;

	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txtten=(EditText) findViewById(R.id.txtTen);
        txtchon=(TextView) findViewById(R.id.txtselection);       
        lv=(ListView) findViewById(R.id.lvperson);
        
        
        //1. Tạo ArrayList object
        arrList=new ArrayList<String>();
        //2. Gán Data Source (ArrayList object) vào ArrayAdapter
        adapter=new ArrayAdapter<String>
        (this,
        android.R.layout.simple_list_item_1,
        arrList);
        //3. gán Adapter vào ListView
        lv.setAdapter(adapter);
        
        btn=(Button) findViewById(R.id.btnNhap);
        //4. Xử lý sự kiện nhấn nút Nhập
        btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {
        	
        arrList.add(txtten.getText()+"");
        adapter.notifyDataSetChanged();
        
        }
        });
        //5. Xử lý sự kiện chọn một phần tử trong ListView
        lv.setOnItemClickListener(new AdapterView
        .OnItemClickListener() {
        public void onItemClick(
        AdapterView<?> arg0,View arg1,
        int arg2,long arg3) {
        
        txtchon.setText("position : "+ arg2+
        "; value ="+arrList.get(arg2));
        }
        });
        //6. xử lý sự kiện Long click
        lv.setOnItemLongClickListener(new AdapterView
        .OnItemLongClickListener() {
        @Override
        public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
        int arg2, long arg3) {
        arrList.remove(arg2);//xóa phần tử thứ arg2
        adapter.notifyDataSetChanged();
        return false;
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
