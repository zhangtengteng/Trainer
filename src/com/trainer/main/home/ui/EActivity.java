package com.trainer.main.home.ui;
import android.os.Bundle;
import android.widget.GridView;

import com.trainer.R;
import com.trainer.adapter.EGridViewAdapter;
import com.trainer.ui.base.BaseActivity;


public class EActivity extends BaseActivity {
	private GridView gridView;
	private EGridViewAdapter eGridViewAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_e_recommend);
		initViews();
	}

	private void initViews() {
		gridView = (GridView) findViewById(R.id.gride_view);
		eGridViewAdapter = new EGridViewAdapter(this);
		gridView.setAdapter(eGridViewAdapter);
	}
	
}
