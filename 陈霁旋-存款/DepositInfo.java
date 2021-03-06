package com.example.happybank;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DepositInfo extends ActionBarActivity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.depositinfo);
		
		final Button buttonsave = (Button) findViewById(R.id.buttonSave);
        buttonsave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// TODO Auto-generated method stub  
                new AlertDialog.Builder(DepositInfo.this).setTitle("取款")//设置对话框标题  
                .setMessage("取款额度：")//设置显示的内容  
                .setPositiveButton("确定",new DialogInterface.OnClickListener() {
                	//添加确定按钮  
                	
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
