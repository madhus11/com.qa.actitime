package com.acti.utilis;

import com.acti.base.DriverScript;

public class Helper extends DriverScript {
	 public static void fn_sleep()
	 {
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
