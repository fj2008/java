package chapter3;

import java.util.*;
//클래스명 자리에"*"가 오면 모든 클래스를 사용하겠다는 뜻
//모든 클래스를 포함한다고 실행할때 시간이 느려지는게 아니라
//컴파일할때 느려지는것임
//최적화에는 영향이 없음
//import java.leng.* 라느 클래스는 컴파일할때 자동으로 컴파일되는데
//그 이유는 Sysout , String이라는 클래스가 들어있기때문에 
//자주 사용하기때문 그래서 프로그래머가 기능을 항상 넣어준거
import static chapter2.Simpletype1.*;
//위 선언은 클래스 선언없이 클래스멤버 들을를 사용할수 있게 해주는 구문
public class Ex4 {
	static int num1 = 10;
	
	static void hell () {
		
	}
	


	public static void main(String[] args) {
		/*import 실습
		 * 패키지를 생략할수 있게 한다
		 * import문끝에는항상 클래스명이 온다
		 * 
		 * */
		chapter2.Simpletype1 type = new chapter2.Simpletype1();
		
		System.out.println("=============");
		System.out.println(num1);
		
		
	}

}
