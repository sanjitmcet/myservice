package com.sanjit.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UserHitCount {
	private String timeStamp;
	private volatile int calls;

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		
		this.timeStamp =timeStamp;
	
	}

	public int getCalls() {		
		return calls;
	}

	public void setCalls(int calls) {		
		this.calls = calls;
	}

	

		

}
