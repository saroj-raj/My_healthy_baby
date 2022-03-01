package com.example.nutri_baby;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class DailyNutrationActivity extends Activity {
	Button back,front;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_nutration);
		back=(Button)findViewById(R.id.button1);
		front=(Button)findViewById(R.id.button2);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(DailyNutrationActivity.this,HygenieActivity.class);
				startActivity(it);
				finish();
				
			}
		});
		front.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(DailyNutrationActivity.this,ProtinActivity.class);
				startActivity(it);
				finish();
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_daily_nutration, menu);
		return true;
	}

}
