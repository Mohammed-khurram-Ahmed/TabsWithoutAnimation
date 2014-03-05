package com.example.testproject;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity {
	RadioGroup radioGroupTabs;
	List<Fragment> fList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		radioGroupTabs = (RadioGroup) findViewById(R.id.radioGroupTabs);
		fList = new ArrayList<Fragment>();
		fList.add(new TabFragment1());
		fList.add(new TabFragment2());
		fList.add(new TabFragment3());
		radioGroupTabs
				.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {

						int pos = 0;
						if (checkedId == R.id.btn1) {
							pos = 0;
						} else if (checkedId == R.id.btn2) {
							pos = 1;
						} else if (checkedId == R.id.btn3) {
							pos = 2;
						}
						selectedItemChange(pos);

					}
				});
	}

	void selectedItemChange(int position) {
		try {
			RadioButton radioButtonTabs = (RadioButton) radioGroupTabs
					.getChildAt(position);
			radioButtonTabs.setChecked(true);
			loadFragment(position); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadFragment(int position) {
		replaceFragment(fList.get(position), R.id.HomeFramLayout, position + "");
	}

	public void replaceFragment(Fragment replacementfragment,
			int replaceResourceId, String fragmentStringName) {

		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		//Most Imp here is we clear the all top fragment on each tab change
		fragmentManager.popBackStack(null,
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
		fragmentTransaction.replace(replaceResourceId, replacementfragment,
				fragmentStringName);
		fragmentTransaction.commit();
	}

}
