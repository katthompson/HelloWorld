package com.hello.world;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ContactListAdapter extends ArrayAdapter<Object> {
	private final Activity activity;
	private final List<Object> contacts;
	
	public ContactListAdapter(Activity activity, List<Object> objects) {
		super(activity, R.layout.contacts_list, objects);
		this.activity = activity;
		this.contacts = objects;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView = convertView;
		ContactListView clView = null;
		
		if(rowView == null ){
			//Get a new instance of the row layout view
			LayoutInflater inflator = activity.getLayoutInflater();
			rowView = inflator.inflate(R.layout.contacts_list, null);
			
			//Hold the view objects in an object, so they don't need to be re-fetched
			clView = new ContactListView();
			clView.username = (TextView) rowView.findViewById(R.id.username);
			clView.email = (TextView) rowView.findViewById(R.id.email);
			
			//Cache the view objects in the tag, so they can be re-accessed later
			rowView.setTag(clView);
		}else {
			clView = (ContactListView) rowView.getTag();
		}
		
		//Transfer the contacts data from the data object to the view objects
		ContactList currentList = (ContactList) contacts.get(position);
		clView.username.setText(currentList.getUserName());
		clView.email.setText(currentList.getEmail());
		
		return rowView;
	}
	protected static class ContactListView {
		protected TextView username;
		protected TextView email;
	}
}