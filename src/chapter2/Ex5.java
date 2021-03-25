package chapter2;

import java.util.Scanner;

public class Ex5 {
	//좋은메서드는 한번에 하나의 동작만 하는 메서드
	void simple () {
		int i = 10+20;
		System.out.println(i);
	}
	void simple1 (int num1,int num2) {
		int i = num1 + num2 ;
		System.out.println(i);
	}
	void simple2 (int num1,int num2) {
		if (num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	void simple3() {
		int num1 = 10;
		int num2 = 11;
		
		if (num1>num2) {
			System.out.println(num1);
		}else
			System.out.println(num2);
	}
	public static void main(String[] args) {
		Ex5 ex5 =new Ex5();
		ex5.simple();
		
		ex5.simple1(4,5);
		
		ex5.simple2(6,1);
		
		ex5.simple3();
		
		
	}

}
