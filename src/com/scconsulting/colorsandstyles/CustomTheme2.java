package com.scconsulting.colorsandstyles;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomTheme2 extends Activity {

	private Spinner spin;
	//array of strings used to populate the spinner
	private String[] fruit =
		{ "Apple", "Banana", "Cherry", "Orange", "Peach", "Pear", "Strawberry" };
	//array of drawable resources
	private Integer[] imageDrawable = {
			R.drawable.apple,
			R.drawable.banana,
			R.drawable.cherry,
			R.drawable.orange,
			R.drawable.peach,
			R.drawable.pear,
			R.drawable.strawberry
	};
	private boolean firstFire = true;
	
	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_theme2);
		
		imageView = (ImageView) findViewById(R.id.imageView1);
		
		spin = (Spinner) findViewById(R.id.spinner1);  //fetching view's id
        //Register a callback to be invoked when an item in this AdapterView has been selected
        spin.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                    int position, long id) { 

                if (firstFire) {
                	firstFire = false;
                }
                else {
                	
                	imageView.setImageResource(imageDrawable[position]);
                	
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
        
        ArrayAdapter<String> spin_adapter = new ArrayAdapter<String>(CustomTheme2.this, R.layout.spinner_item, fruit);
        spin.setAdapter(spin_adapter);  // Set adapter to spinner
        
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.colors_and_styles, menu);
		return true;
	}

}
