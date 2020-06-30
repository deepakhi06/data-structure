package com.utsav.thread;

import java.text.SimpleDateFormat;

public class ThreadLocalDemp implements Runnable {

	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};

	@Override
	public void run() {
	

	}

}
