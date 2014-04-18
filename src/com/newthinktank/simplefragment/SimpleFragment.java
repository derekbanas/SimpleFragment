package com.newthinktank.simplefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// A Fragment is sort of a mini Activity which you can add
// or remove from another Activity.

// You can use them to create reusable pieces you can add 
// to your interface.

// They are often used so that depending on your screen size 
// you can add more or less fragments

public class SimpleFragment extends Fragment {

	// onCreateView is called when the Fragment is first called for
	
	// The LayoutInflater inflates an xml file into the view
	
	// A ViewGroup is an abstract class that all ViewGroups like 
	// LinearLayout extends
	
	// A Bundle is used to pass data between Activities such as
	// variable data you'd want saved if the orientation of the
	// device changes

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// Inflate the Fragment, but don't attach it to the main 
		// activity LinearLayout because attachToRoot is marked
		// as false
		
		View simpleFragmentView = inflater.inflate(R.layout.fragment_textview, container, false);

		return simpleFragmentView;
	}

}