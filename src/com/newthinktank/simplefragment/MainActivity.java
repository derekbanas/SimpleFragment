package com.newthinktank.simplefragment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.FragmentManager;


public class MainActivity extends Activity {

	// The Fragment that will be added to the main Activity
	
	SimpleFragment simpleFragment;

	// Called when Activity is created

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// The FragmentManager provides methods for interacting
		// with Fragments in this Activity
		
		FragmentManager fragmentManager = getFragmentManager();
		
		// The FragmentTransaction adds, removes, replaces and 
		// defines animations for Fragments
		
		// beginTransaction() is used to begin any edits of Fragments
		
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

		// Create our Fragment object
		
		SimpleFragment simpleFragment = new SimpleFragment();
		
		// Add the Fragment to the Activity
		
		fragmentTransaction.add(R.id.simplefragment, simpleFragment);
		
		// Schedules for the addition of the Fragment to occur
		
		fragmentTransaction.commit();

	}

}