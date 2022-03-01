package com.example.nutri_baby;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class HygenieActivity extends Activity {
	Button front,back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hygenie);
		back = (Button) findViewById(R.id.button1);
		front = (Button) findViewById(R.id.button2);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t1=new Intent(HygenieActivity.this,FoodlistActivity.class);
				startActivity(t1);
				finish();
			}
		});
		
		front.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t2=new Intent(HygenieActivity.this,DailyNutrationActivity.class);
				startActivity(t2);
				finish();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hygenie, menu);
		return true;
	}

}
