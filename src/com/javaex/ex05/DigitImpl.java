package com.javaex.ex05;

//이미 상속받은게 있어서 Thread를 상속 받을 수 없을때
/*
public class DigitThread extends Shape, Thread{
	
} 
*/

public class DigitImpl implements Runnable{ 

	public void run() {
		
		for(int i=0; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
}
