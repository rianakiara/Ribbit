package com.ianakiara.ribbit;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "36yDnZe8bcMUwlNmPUIm5zozxEYFzFTkaJBiQCrX", "2s1rFGJfyUYXoRkjnMyHvO9uRxmIqFd0wZg2J7og");
		
	}
}
