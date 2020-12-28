package com.web.jukebox;

public class Test {
	public static void main(String[] args) {
		String x ="pawan";
		String y="kushwah";
		x=x+y;
		y=x.replace(y, "");
		x=x.replace(y, "");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
}
