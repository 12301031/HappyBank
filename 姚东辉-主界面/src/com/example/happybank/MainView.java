package com.example.happybank;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainView extends Activity{
	private Button button_newbank; //�½�����
	private Button button_bank1;   //����1
	private Button button_bank2;   //����2
	private Button button_bank3;   //����3
	private Button button_mood;    //��������
	private Button button_soup;    //���鼦��
	private Button button_set;     //���ð�ť
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//���ر�����

		//����¼�������
		//�½�����
		button_newbank = (Button)this.findViewById(R.id.button_newbank);
		button_newbank.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//����1
		button_bank1 = (Button)this.findViewById(R.id.button_bank1);
		button_bank1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//��������
		button_mood = (Button)this.findViewById(R.id.button_mood);
		button_mood.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//���鼦��
		button_soup = (Button)this.findViewById(R.id.button_soup);
		button_soup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//����
		button_set = (Button)this.findViewById(R.id.button_set);
		button_set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
