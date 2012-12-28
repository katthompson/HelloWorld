package com.hello.world;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity{
	//adding text to text submit to git
	Button btnUsage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
		
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
	
	public void addListenerOnButton() {
		final Context context = this;
		btnUsage = (Button) findViewById(R.id.usage_button);
		btnUsage.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, HelloActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		//respond to menu item selection
		switch (item.getItemId()) {
		case R.id.menu_home:
			startActivity(new Intent (this, MainActivity.class));
			return true;
		case R.id.menu_contacts:
			startActivity(new Intent (this, ContactsActivity.class));
			return true;
		case R.id.menu_calling:
			startActivity(new Intent (this, GoogleMapsActivity.class));
			return true;
			default:
			return super.onOptionsItemSelected(item);
		}
	}
	

}

