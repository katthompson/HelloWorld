package com.hello.world;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class HelloActivity extends ListActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_hello);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		        "Linux", "OS/2" };
		    // Use your own layout, can add footer in the same way as the header
		View header = getLayoutInflater().inflate(R.layout.header, null);
		ListView listView = getListView();
		listView.addHeaderView(header);
		    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        R.layout.rowlayout, R.id.label, values);
		    setListAdapter(adapter);
	}
	
	@Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    String item = (String) getListAdapter().getItem(position - 1);
	    Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();
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
			default:
			return super.onOptionsItemSelected(item);
		}
	}

	
	
}
