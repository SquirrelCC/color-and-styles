package com.scconsulting.colorsandstyles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AndroidTheme extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_theme);
	}
	
	public void click1(View v) {
		Intent intent = new Intent(AndroidTheme.this, CustomTheme.class);
        startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.colors_and_styles, menu);
		return true;
	}

}
