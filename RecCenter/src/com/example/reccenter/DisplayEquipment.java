package com.example.reccenter;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class DisplayEquipment extends Activity {
	TextView textLabel;
	ImageView equipImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display_equipment_layout);
		// Show the Up button in the action bar.
		setupActionBar();
		
	
		final Equipment exampleEquip = new Equipment("Example Flexor", "big_al","Flabby Ones", "www.google.com", "na" );
		final ArrayList<String> samList = new ArrayList<String>();
		
		samList.add("Name of Machine");		
		samList.add("Muscle Groups");
		samList.add("Location");
		
		textLabel = (TextView) findViewById(R.id.text_label);
		textLabel.setText(exampleEquip.getName());
		
		equipImage = (ImageView) findViewById(R.id.equip_image);
				
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_equipment, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
