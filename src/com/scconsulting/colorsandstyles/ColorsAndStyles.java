package com.scconsulting.colorsandstyles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ColorsAndStyles extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.colors_and_styles);
	}
	
	public void click1(View view) {
		Toast.makeText(getApplicationContext(), "Hey, you pushed me! Quit that!!", Toast.LENGTH_LONG).show();
	}
	
	public void click2(View view) {
		Intent intent = new Intent(ColorsAndStyles.this, AndroidTheme.class);
        startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.colors_and_styles, menu);
		return true;
	}

}
