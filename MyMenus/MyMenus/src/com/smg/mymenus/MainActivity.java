package com.smg.mymenus;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	// Global variables
	RelativeLayout activeLayout;
	TextView myname;
	int color_scheme = 0;
	int text_size = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// set the background color of the Relative Layout
	// set the color of the text
	public void changeScheme(int colorValue) {
		activeLayout = (RelativeLayout) findViewById(R.id.backroundLayout);
		myname = (TextView) findViewById(R.id.textViewName);
		color_scheme = colorValue;
		switch (colorValue) {
		case 0:
			activeLayout.setBackgroundColor(getResources().getColor(
					R.color.BlueBG)); // night scheme
			myname.setTextColor(getResources().getColor(R.color.BlueTxt));
			break;
		case 1:
			activeLayout.setBackgroundColor(getResources().getColor(
					R.color.GreenBG)); // nature scheme
			myname.setTextColor(getResources().getColor(R.color.GreenTxt));
			break;
		case 2:
			activeLayout.setBackgroundColor(getResources().getColor(
					R.color.OrangeBG)); // fluro scheme
			myname.setTextColor(getResources().getColor(R.color.OrangeTxt));
			break;
		case 3:
			activeLayout.setBackgroundColor(getResources().getColor(
					R.color.YellowBG)); // construction scheme
			myname.setTextColor(getResources().getColor(R.color.YellowTxt));
			break;
		case 4:
			activeLayout.setBackgroundColor(getResources().getColor(
					R.color.White)); // standard scheme
			myname.setTextColor(getResources().getColor(R.color.Black));
			break;
		}
	} // end of changeScheme method

	// set the text size for the resistor value.
	public void changeTextSize(int size) {
		myname = (TextView) findViewById(R.id.textViewName);
		text_size = size;
		switch (size) {
		case 0:
			myname.setTextSize(TypedValue.COMPLEX_UNIT_SP, getResources()
					.getDimension(R.dimen.text_size_sml));
			break;
		case 1:
			myname.setTextSize(TypedValue.COMPLEX_UNIT_SP, getResources()
					.getDimension(R.dimen.text_size_med));
			break;
		case 2:
			myname.setTextSize(TypedValue.COMPLEX_UNIT_SP, getResources()
					.getDimension(R.dimen.text_size_lge));
			break;
		}
	} // end of changeTextSize method

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		int id = item.getItemId();
		switch (id) {
		case R.id.blue:
			changeScheme(0);
			return true;
		case R.id.green:
			changeScheme(1);
			return true;
		case R.id.orange:
			changeScheme(2);
			return true;
		case R.id.yellow:
			changeScheme(3);
			return true;
		case R.id.standard:
			changeScheme(4);
			return true;
		case R.id.text_sml:
			changeTextSize(0);
			return true;
		case R.id.text_med:
			changeTextSize(1);
			return true;
		case R.id.text_lrg:
			changeTextSize(2);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
