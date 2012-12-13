package com.hello.world;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ContactsActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts);
		 List<Object> contacts = new ArrayList<Object>();
		 contacts.add(new ContactList("Frodo", "frodo@shire.com"));
		 contacts.add(new ContactList("Samwise", "samwise@shire.com"));
		 contacts.add(new ContactList("Pippen", "pippen@shire.com"));
		 contacts.add(new ContactList("Merry", "merry@shire.com"));
		 

		 setListAdapter(new ContactListAdapter(this, contacts));

		 
		 
	}
	@Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    Object item = (Object) getListAdapter().getItem(position);
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
