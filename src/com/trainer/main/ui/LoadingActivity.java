package com.trainer.main.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

import com.diy.widget.CircularImage;
import com.trainer.R;
import com.trainer.ui.base.BaseActivity;

public class LoadingActivity extends BaseActivity {
	private String userName;
	private String passWord;
	private final int MESSAGESUCCESS = 0;
	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case 0:
//				ActivityManager.getInstance().startNextActivity(
//						LoginActivity.class);
//				LoadingActivity.this.finish();
				break;

			default:
				break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		initViews();
		
	}
/***
 * 

	private void showLoading() {
		userName = SharedPreManager.getInstance().getString("userName", null);
		passWord = SharedPreManager.getInstance().getString("passWord", null);
		if (userName != null || passWord != null) {
			
		} else {
			new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						Thread.sleep(1000);
						handler.sendEmptyMessage(MESSAGESUCCESS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
	
	 */

	private void initViews() {
//		CircularImage cover_user_photo = (CircularImage) findViewById(R.id.cover_user_photo);
//		cover_user_photo.setImageResource(R.drawable.item01);
		
		findViewById(R.id.TextView1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
