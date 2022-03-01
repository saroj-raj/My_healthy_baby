package com.example.nutri_baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ListActivity extends Activity {
	private RadioGroup radioSexGroup;
	private RadioButton radioSexButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);

		radioSexGroup = (RadioGroup) findViewById(R.id.radioGroup1);

		Button btnDisplay = (Button) findViewById(R.id.button1);

		btnDisplay.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int selectedId = radioSexGroup.getCheckedRadioButtonId();
				radioSexButton = (RadioButton) findViewById(selectedId);
				String aa = radioSexButton.getText().toString();
				if (aa.equals("Pregnancy")) {
					Intent it = new Intent(ListActivity.this,
							FoodlistActivity.class);
					startActivity(it);
					finish();
				} else {
					Intent it = new Intent(ListActivity.this,
							ChartActivity.class);
					startActivity(it);
					finish();
				}

				Toast.makeText(ListActivity.this, radioSexButton.getText(),
						Toast.LENGTH_SHORT).show();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_list, menu);
		return true;
	}

}
