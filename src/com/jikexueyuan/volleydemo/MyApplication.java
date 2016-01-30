package com.jikexueyuan.volleydemo;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MyApplication extends Application {
	public static RequestQueue queue;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		queue = Volley.newRequestQueue(getApplicationContext());
	}

	public static RequestQueue getHttpQueue() {
		return queue;
	}

}
