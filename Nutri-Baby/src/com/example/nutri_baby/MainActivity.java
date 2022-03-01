package com.example.nutri_baby;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread background=new Thread(){
        	
			public void run() {
				try {
					sleep(5*1000);
					
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				Intent it=new Intent(MainActivity.this,ListActivity.class);
				startActivity(it);
				finish();
			}
    };
    background.start();
			
		
    	
    };


   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
