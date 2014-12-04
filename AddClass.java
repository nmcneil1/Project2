package com.example.gradesmart;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;



public class AddClass extends ActionBarActivity {

	Button btnAddCategory, btnSave;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_class);
		
		btnAddCategory = (Button) findViewById(R.id.btnAddCategory);
		btnSave = (Button) findViewById(R.id.btnSave);
		
		btnAddCategory.setOnClickListener(new ButtonListener());
		btnSave.setOnClickListener(new ButtonListener());
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_class, menu);
		return true;
	}

	
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private class ButtonListener implements OnClickListener {
		public void onClick(View v) {
			if(btnSave.getId() == ((Button)v).getId()) {
				startActivity(new Intent(AddClass.this, Homepage.class));
			}
			else if(btnAddCategory.getId() == ((Button)v).getId()) {
				
			}
		}
	}
}
