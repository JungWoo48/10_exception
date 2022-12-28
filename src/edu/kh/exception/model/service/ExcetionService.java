package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ExcetionService {
	
	Scanner sc = new Scanner(System.in);
	
	// 에외(Excetion)은 소스코드의 수정으로 해결 가능한 오류
	
		// 예외는 두종류로 구분한다
		// 1)unchecked excetion 	: 선택적으로 예외처리
		// 2)checked excetion 	: 필수적으로 예외처리
	
	public void ex1() {
	
		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
		
		
		System.out.println("정수 1입력");
		int input = sc.nextInt();
		
		System.out.println("정수 2입력");
		int input2 = sc.nextInt();
		
		// ArithmeticException : 산술적 예외
		//  /by zero -- 0으로 나눌수 없다
		
		
		//try -catch 예외 처리
		
		//try{ } : 괄호 내부에 예외가 발생할 가능성이 잇는 코드를 작성한 후 시도
		
		//catch { } : try 구문에서 발생한 예외를 잡아내서 처리하여
					// 프로그램이 비정상 종료되지 않게 함
		
		
		
		try {System.out.println("결과 : " + input / input2);
			//산술적 예외가 일어날것 같은 부분을 try문 에 넣는다
		} catch(ArithmeticException e ) {
			//try에서 던져진 예외를 catch로 잡음
			
			System.out.println("infinity");//처리 코드
		}
		
		if(input2 !=0) {
			System.out.println("결과 : " + input / input2);
		}else {
			System.out.println("infinity");
		}
		//발생하는 예외중 일부 예외는 try - catch 구문을 사용하지 않아도 방지 가능
		// (일부 예외로 대부분의 UncheckedExcetion이 있다
		

	}
	
	/*(public void ex2() {
		
	
		// 정수를 입력 받아 반환하는 메서드
		public int inputNumber() {
			int num = 0;
			
			while(true) {
				try { 
					
					System.out.print("정수입력 : ");
					num = sc.nextInt();
					
					break;
					
				}catch(InputMismatchExcetion e) {
					System.out.println("정수만 입력");
					sc.nextLine();//버퍼에 남아있는 잘못된 문자열 제거
				}
				
				
			}
			
			return num;
		*/
	
	public void ex3() {
		//정수 3개를 입력받아 3개의 합계 구하기
		
	
		int sum = 0;
		
		for(int i =0; i <3; i++) {
			sum += i;
		}
	}
	public void ex4() {
		//여러가지 예외에 대한처리법
		try {
		System.out.print("정수입력 1 : ");//inputmismatch 가능
		int num1 = sc.nextInt();
		
		System.out.print("정수입력 2 : ");//inputmismatch 가능
		int num2 = sc.nextInt();
		
		System.out.println("나누기 결과 : " + num1 / num2);//ArithmeticException 가능
		
		
		//------------------------
		//강제로 NullPointExcetion 발생
		// * NullPointExcetion: 참조 하지 않는 참조조변수를 이용하여 코드를 수행랄때 발생
		
		String str = null;
		System.out.println( str.charAt(0));
		
		
		
		
		
		
		//관계 없는 예외는 순서 관계 없이 catch문에 작성하면 된다
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없다.");
		} catch(InputMismatchException e) {
			System.out.println("정수가 아닌 문자.");
		} catch(Exception e) {
			//예외처리 + 다형성
			//Exception 클래스 : 모든 예외의 최상위 부모
			//다형성 - 업캐스팅 : 부모 타입 참조변수로 자식객체 참조
			
			//** 상위 타입의 예외 클래스를 catch문에 작성하면
			//  다형성 업캐스팅에 의해 모두 잡아서 처리
			// 즉 Exception e만 쓰면 모든 예외처리 가능
			System.out.println("알수없는 예외로 처리됨");
		}
	}	//catcha문 연속 작성시 상속구조 주의
	
	public void ex5() {
		//try catch finally
		//finally : try에서 예외가 발생 하든 말든 마지막에 반드시 수행하는 구문
		
		try {
			System.out.println( 4 / 0); //ArithmeticException 발생가능
		} catch (ArithmeticException e) { 
			System.out.println("예외 처리됨");
		
			//catch문 매개변수 활용
			//매개변수 e: 예외 관련 정보 + 예외 관련 기능
			
			System.out.println( e.getClass() );// 어떤 예외 클래스 인가?
			System.out.println( e.getMessage());//예외 발생시 출력된 내용
		
			System.out.println( e ); // e.toString();
			// == > java.lang.ArithmeticException: / by zero
		
		
			e.printStackTrace(); // 예외가 발생하기 까지의 모든 메소드 흐름을 출력
			//어디서  어떤 에러가 발생하는지 정확히 파악하는 용도
			
		
		} finally {
			System.out.println("무조건 수행");
			
		}
		
		
	}
	
	public void ex6() {
		//throws: 호출한 메서드에게 예외를 던진다
		//-> 예외를 위임하는 행위
		
		//throw : 예외 강제 발생 구문
		
		
		
		try {
			methodA();
		} catch(Exception e) {
			//Exception : 모든 예외의 최상위 부모
			// -> 에외 종류 상관 없이 모두 처리 가능
			
			 System.out.println("에외 처리됨");
			 
			 e.printStackTrace();
			 //발생한 예외 처리 지점 출력
			
			
		}
		
	}
	
	public void methodA()  throws IOException {
		methodB();
	}
	
	public void methodB()  throws IOException {
		methodC();
	}
	
	public void methodC() throws IOException {
		//IOException 예외  강제발생
		throw new IOException();
		
		//발생한 예외 처리하는 방법
		//1) try - catch로 감싸서 현재 위치에서 처리
		//2) throws로 호출한 메서드로 예외를 위임하여 처리
	}
	
	public void methodD() {
		throw new RuntimeException();
		
		//ChechedException : 
		//- RuntimeException과 자식 예외를 제외한 나머지 예외
		//if문과 같은 단순 코드로 해결이 불가능하다
		// 반드시 에외 처리구문(try -catch)문을 작성해야함
		
		//UnCheckedException :
		//-RuntimeException과 자식 예외를 지정함
		//프로그램 수행중 코딩실수또는 잘못된 입력으로 흔히 발생하는 예외
		//if문과 같은 단순 코드로 해결 가능
		//예외구문이 반드시 필요하지 않음
	
	
	
	}
	
	

}




