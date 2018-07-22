package com.sanjit.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.sanjit.Model.UserHitCount;

@Service ("depositManager")
public class AppMgrImpl implements AppImpl{
	private volatile int calls;
	
	
	public int getHitCount() {
		calls++;
		return calls;
	}
	public String getCurrTS() {
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); 
		df.setTimeZone(tz);
		String nowAsISO = df.format(new Date());
		return nowAsISO;
		
	}

	@Override
	public UserHitCount getUserHitCount() {
		UserHitCount uhc = new UserHitCount();
		uhc.setCalls(getHitCount());
		uhc.setTimeStamp(getCurrTS());
		return uhc;
	}

}
