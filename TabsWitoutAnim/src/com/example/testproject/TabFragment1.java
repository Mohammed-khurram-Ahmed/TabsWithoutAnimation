package com.example.testproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment1 extends Fragment {

	@Override
	public void onAttach(Activity activity) {
		Log.e("Tab1", "onAttach");

		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.e("Tab1", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.e("Tab1", "onCreateView");
		View rootView = inflater.inflate(R.layout.tab1, container, false);
		return rootView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.e("Tab1", "onActivityCreated");
	}

	@Override
	public void onStart() {
		Log.e("Tab1", "onStart");

		super.onStart();
	}

	@Override
	public void onResume() {
		Log.e("Tab1", "onResume");
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.e("Tab1", "onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.e("Tab1", "onStop");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.e("Tab1", "onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.e("Tab1", "onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.e("Tab1", "onDetach");
		super.onDetach();
	}

}
