package com.example.reccenter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class CardioSection extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cardio_section);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cardio_section, menu);
		return true;
	}
    public void sendTreadmill(View view) {
    	Intent intent = new Intent(this, Treadmill.class);
        startActivity(intent);
    }
    public void sendElliptical(View view) {
    	Intent intent = new Intent(this, Elliptical.class);
        startActivity(intent);
    }
    public void sendStatBike(View view) {
    	Intent intent = new Intent(this, StatBike.class);
        startActivity(intent);
    }
    public void sendErg(View view) {
    	Intent intent = new Intent(this, Erg.class);
        startActivity(intent);
    }

}
