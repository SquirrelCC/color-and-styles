package com.scconsulting.colorsandstyles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class CustomTheme extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_theme);
	}
	
	public void click1(View v) {
		
		int whichButton = 0;
		switch (v.getId()) {
		
		  case R.id.button1:
			  whichButton = 1;
		      break;
		        
		  case R.id.button2:
			  whichButton = 2;
			  break;
			  
		  case R.id.button3:
			  whichButton = 3;
			  break;
			  
		  case R.id.button4:
			  whichButton = 4;
			  break;
			  
		  case R.id.button5:
			  whichButton = 5;
			  break;
			  
		  case R.id.button6:
			  whichButton = 6;
			  break;
			  
		  case R.id.button7:
			  whichButton = 7;
			  break;
			  
		  case R.id.button8:
			  whichButton = 8;
			  
			  Intent intent = new Intent(CustomTheme.this, CustomTheme2.class);
		        startActivity(intent);
		        
			  break;
			  
		}
		
		if (whichButton < 8) {
			Toast.makeText(getApplicationContext(), "You pushed button: " + whichButton, Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.colors_and_styles, menu);
		return true;
	}
	
	@Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {

	    case R.id.action_settings:
	      Toast.makeText(this, "Action Settings selected", Toast.LENGTH_SHORT).show();
	      break;

	    default:
	      break;
	    }

	    return true;
	  }

}
