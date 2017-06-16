package com.example.thongtincanhan;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	
	EditText edtTen, edtCMND, edtBoSung;
	RadioButton rbtTC, rbtCD, rbtDH;
	CheckBox cbDocBao, cbDocSach, cbDocCode;
	Button btnGui;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        edtTen = (EditText)findViewById(R.id.editHoten);
        edtCMND = (EditText)findViewById(R.id.editCMND);
        edtBoSung = (EditText)findViewById(R.id.editBosung);
        
        rbtTC = (RadioButton)findViewById(R.id.radtc);
        rbtCD= (RadioButton)findViewById(R.id.radcd);
        rbtDH = (RadioButton)findViewById(R.id.raddh);
        
        cbDocBao = (CheckBox)findViewById(R.id.chkdocbao);
        cbDocSach = (CheckBox)findViewById(R.id.chkdocsach);
        cbDocCode = (CheckBox)findViewById(R.id.chkdoccoding);
        
        
        btnGui = (Button)findViewById(R.id.btnguitt);
        btnGui.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				ThongTin();
				
				
			}
		});
          
    }

    
    public void ThongTin(){
    	
    	//Kiểm tra tên hợp lệ
    	
    	String ten = edtTen.getText().toString();
    	ten = ten.trim();
    	if(ten.length() < 3)
    	{
    	
    		edtTen.requestFocus();
    		edtTen.selectAll();
    		
    		Toast.makeText(this, "Tên phải >= 3 kí tự", Toast.LENGTH_LONG).show();
    		return;
    	}
    	
    	//Kiểm tra CMT hợp lệ
    	
    	String cmnd = edtCMND.getText().toString();
    	cmnd = cmnd.trim();
    	
    	if(cmnd.length()!=9)
    	{
    		edtCMND.requestFocus();
    		edtCMND.selectAll();
    		Toast.makeText(this,"CMND phải đúng 9 kí tự",Toast.LENGTH_LONG).show();
    		return;
    	}
    	//kiểm tra bằng cấp
    	String bang = "";
    	RadioGroup group = (RadioGroup)findViewById(R.id.radioGroup1);
    	int id = group.getCheckedRadioButtonId();
    	if(id == -1)
    	{
    		Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_LONG).show();
    		return;
    	}
    	
    	RadioButton rad=(RadioButton)findViewById(id);
    	bang=rad.getText()+"";

    	//Kiểm tra sở thích
    	
    	String sothich= "";
    	if(cbDocBao.isChecked())
    		sothich+=cbDocBao.getText()+"\n";
    	if(cbDocSach.isChecked())
    		sothich+=cbDocSach.getText()+"\n";
    	if(cbDocCode.isChecked())
    		sothich+=cbDocCode.getText()+"\n";
    	
    	String bosung=edtBoSung.getText().toString();
    	
    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
    	builder.setTitle("Thông tin cá nhân");

    	builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		});
    	
    	//tạo nội dung
    	String msg=ten+"\n";
    	msg+= cmnd+"\n";
    	msg+=bang+"\n";
    	msg+="—————————–\n";
    	msg+="Sở Thích:\n";
    	msg+=sothich+"\n";
    	msg+="—————————–\n";
    	msg+="Thông tin bổ sung:\n";
    	msg+=bosung+ "\n";
    	msg+="—————————–";
    	builder.setMessage(msg);//thiết lập nội dung
    	builder.create().show();//hiển thị Dialog

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
