package com.example.happybank;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class PasswordModifyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_password_modify);
	}


}
