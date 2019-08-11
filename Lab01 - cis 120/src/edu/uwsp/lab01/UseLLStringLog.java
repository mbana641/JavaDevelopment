package edu.uwsp.lab01;

public class UseLLStringLog {
	
	public static void main(String[] args) {		
		LinkedStringLog strLog;
		strLog = new LinkedStringLog("Nicknames");
		String s1 = new String("Slim");
		strLog.insert(s1);
		String s2 = new String("Babyface");
		strLog.insert(s2);
		String s3 = new String("Slim");
		strLog.insert(s3);
		String s4 = new String("Apple");
		strLog.insert(s4);
		
		System.out.println(strLog);
		System.out.println(strLog.delete("Apple"));
		System.out.println(strLog);
	}
}
