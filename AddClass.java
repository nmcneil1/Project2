package com.example.gradesmart;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;



public class AddClass extends ActionBarActivity {

	Button btnAddCategory, btnSave;
	LinearLayout leftPanel, rightPanel;
	List<EditText> categories = new ArrayList<EditText>();
	List<EditText> weights = new ArrayList<EditText>();
	TextView category_text;
	TextView weight_text;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_class_activity);
		
		btnAddCategory = (Button) findViewById(R.id.btnAddCategory);
		btnSave = (Button) findViewById(R.id.btnSave);
		
		btnAddCategory.setOnClickListener(new ButtonListener());
		btnSave.setOnClickListener(new ButtonListener());
		
		category_text.setText("Category");
		category_text.setHeight(50);
		weight_text.setText("Weight");
		weight_text.setHeight(50);
		
		leftPanel = (LinearLayout) findViewById(R.id.left_panel);
		rightPanel = (LinearLayout) findViewById(R.id.right_panel);
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
				//Save as string, Class -> Category -> weight -> Cat -> Weight
				//all on 1 line, each class will be separate line
				//Create a stringBuilder class, call from here, save to file
				startActivity(new Intent(AddClass.this, Homepage.class));
			}
			else if(btnAddCategory.getId() == ((Button)v).getId()) {
				EditText newCat = new EditText(AddClass.this);
				categories.add(newCat);
				
				EditText newWeight = new EditText(AddClass.this);
				weights.add(newWeight);
				
				
				rightPanel.addView(newCat);
				rightPanel.addView(newWeight);

				leftPanel.addView(category_text);
				leftPanel.addView(weight_text);
			}
		}
	}
}
