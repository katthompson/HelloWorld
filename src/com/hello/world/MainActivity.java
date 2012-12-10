package com.hello.world;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity{
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ProgressBar minutesProgressBar = (ProgressBar) findViewById(R.id.progressBar);
	    minutesProgressBar.setProgress(70);
	    
	    TextView accessory_tv = (TextView) findViewById(R.id.accessories);
	    accessory_tv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mystring = "Clicked Accessories!";
				Toast.makeText(MainActivity.this, mystring, Toast.LENGTH_SHORT).show();
			}
	    });
	   
	    
	    TextView purchase_tv = (TextView) findViewById(R.id.purchase);
	    purchase_tv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mystring = "Clicked Purchase!";
				Toast.makeText(MainActivity.this, mystring, Toast.LENGTH_SHORT).show();
			}
	    });
	    
	    TextView help_tv = (TextView) findViewById(R.id.help);
	    help_tv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mystring = "Clicked Help!";
				Toast.makeText(MainActivity.this, mystring, Toast.LENGTH_SHORT).show();
			}
	    });
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

