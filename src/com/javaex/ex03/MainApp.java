package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {
		
		//쓰레드생성
		Thread t01 = new DigitThread();
		Thread t02 = new LowerThread();
		Thread t03 = new UpperThread();
		
		//쓰레드 실행
		t01.start();
		t02.start();
		t03.start();

		
	}
	
}
