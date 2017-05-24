package com.example.bai12;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button btntinhtt,btntiep,btnthongke ;
	 
	ImageButton btnThoat;
	 
	EditText editTenkh,editSoluongsach,editTong,editvip,editTongTT;
	 
	TextView txtthanhtien;
	 
	CheckBox chklavip;
	 
	DanhSachKhachHang danhsach=new DanhSachKhachHang();
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        
        
        getControls();
        
  //      addEvents();

    }
    
    private void getControls()
    
    {
    	
    	btntinhtt=(Button) findViewById(R.id.btntinhtt);
    	 
    	btntiep=(Button) findViewById(R.id.btntiep);
    	 
    	btnthongke=(Button) findViewById(R.id.btnthongke);
    	 
    	btnThoat=(ImageButton) findViewById(R.id.btnthoat);
    	 
    	editTenkh=(EditText) findViewById(R.id.editTenkh);

    editSoluongsach=(EditText) findViewById(R.id.editsoluongsach);
     
    editTong=(EditText) findViewById(R.id.editTong);
     
    editvip=(EditText) findViewById(R.id.editvip);
     
    editTongTT=(EditText) findViewById(R.id.editTongTT);
     
    txtthanhtien=(TextView) findViewById(R.id.txtthanhtien);
     
    chklavip =(CheckBox) findViewById(R.id.cklavip);
     
    }

    private void addEvents()
    
    {
     
    	btntinhtt.setOnClickListener(new ProcessMyEvent());
     
    	btntiep.setOnClickListener(new ProcessMyEvent());
	     
	    btnthongke.setOnClickListener(new ProcessMyEvent());
     
	    btnThoat.setOnClickListener(new ProcessMyEvent());
     
    }
    private void doTinhTien()
    
    {
     
    KhachHang kh=new KhachHang();
     
    kh.setTenKh(editTenkh.getText()+"");
     
    kh.setSlmua(Integer.parseInt(editSoluongsach.getText()+""));
     
    kh.setVip(chklavip.isChecked());
     
    txtthanhtien.setText(kh.tinhThanhTien()+"");
     
    danhsach.addKhachHang(kh);
     
    }
     
    private void doTiep()
     
    {
     
    editTenkh.setText("");
     
    editSoluongsach.setText("");
     
    txtthanhtien.setText("");
     
    editTenkh.requestFocus();
     
    }
     
    private void doThongKe()
     
    {
     
    editTong.setText(danhsach.tongKhachHang()+"");
     
    editvip.setText(danhsach.tongKhachHangVip()+"");
     
    editTongTT.setText(danhsach.tongDoanhThu()+"");
     
    }
     
    private void doThoat()
     
    {
     
    AlertDialog.Builder builder=new AlertDialog.Builder(this);
     
    builder.setTitle("hỏi thoát chương trình”);
     
    builder.setMessage("Muốn thoát chương trình này hả?”);
     
    builder.setNegativeButton("Không”, new DialogInterface.OnClickListener() {
     
    @Override
     
    public void onClick(DialogInterface dialog, int which) {
     
    dialog.cancel();
     
    }
     
    });
     
    builder.setPositiveButton(“Có”, new DialogInterface.OnClickListener() {
     
    @Override
     
    public void onClick(DialogInterface dialog, int which) {
     
    finish();
     
    }
     
    });
     
    builder.create().show();
     
    }
     
    private class ProcessMyEvent implements OnClickListener
     
    {
     


    	@Override
    	 
    	public void onClick(View ago) {
    	 
    	switch(arg0.getId())
    	 
    	{
    	 
    	case R.id.btntinhtt:
    	 
    	doTinhTien();
    	 
    	break;
    	 
    	case R.id.btntiep:
    	 
    	doTiep();
    	 
    	break;
    	 
    	case R.id.btnthongke:
    	 
    	doThongKe();
    	 
    	break;
    	 
    	case R.id.btnthoat:
    	 
    	doThoat();
    	 
    	break;
    	 
    	}
    	 
    	}
    	 
    	}
    	 
}
