package com.hook;

import com.base.BaseClass;

public class HooksClass extends BaseClass {
	
	public void beforeExecution() {
		launchBrowser();
		maxiWindow();
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/");
	}

	public void afterExecution() {

		closeAll();
}
}
