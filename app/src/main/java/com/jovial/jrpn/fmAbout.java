package com.jovial.jrpn;

import com.jovial.jrpn.R;

import android.app.Activity;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//The "vanity plate"
public class fmAbout extends Activity {
	// I like to manually control the release date value

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
	}

	// let's blow this pop stand!
	public void Close(View v) {
		finish();
	}
}