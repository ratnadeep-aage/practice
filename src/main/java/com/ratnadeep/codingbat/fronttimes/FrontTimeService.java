package com.ratnadeep.codingbat.fronttimes;

public class FrontTimeService {
	
	public String frontTimes(String str, int n) {
		
		if(str == null || str.isEmpty()) {
			return "";
		}
		
		String stringCopy = "";
		int frontLen = Math.min(3, str.length());
		String frontString = str.substring(0,frontLen);
		for(int i = 0; i < n; i++) {
			stringCopy =  stringCopy + frontString;
		}
		
		return stringCopy;
	}

}
