package com.example.nutri_baby;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;

public class FoodlistActivity extends Activity {
	private RadioGroup radioSexGroup;
	private RadioButton radioSexButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_foodlist);
		

		radioSexGroup = (RadioGroup) findViewById(R.id.radioGroup1);

		Button btnDisplay = (Button) findViewById(R.id.button1);

		btnDisplay.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int selectedId = radioSexGroup.getCheckedRadioButtonId();
				radioSexButton = (RadioButton) findViewById(selectedId);
				String aa = radioSexButton.getText().toString();
				if (aa.equals("Veg")) {
					Intent it = new Intent(FoodlistActivity.this,
							HygenieActivity.class);
					startActivity(it);
							finish();
				} else {
					Intent it = new Intent(FoodlistActivity.this,
							NonVegActivity.class);
					startActivity(it);
					finish();
				}

				Toast.makeText(FoodlistActivity.this, radioSexButton.getText(),
						Toast.LENGTH_SHORT).show();
			}
		});

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_foodlist, menu);
		return true;
	}

}
