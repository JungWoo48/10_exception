package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//int a = 99.9 // 컴파일 에러
				//개발자가 코드를 잘못쓴 경우
				//소스코드 수정으로 해결 가능
			//1) 자료형을 double로
			//2) (int)99.9 로 강제 형변환
			//3) 99.9를 정수로 수정
		
		/*while(true) { 
			
			System.out.println("정수 입력(0입력시 종료) : ");
			int input = sc.nextInt();
			//정수가 아닌것을 넣을시 오류
		
			if(input == 0) {//탈출구문
				break;
			}
			
		}
		//런타입 에러
		//플그램 수행중 발생하는 에러
		//주로 if문으로 처리 가능
		*/
		
		int[] arr = new int[3]; //길이 3: 인덱스 0,1,2까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if(3 >= arr.length) {//if로 해결
			System.out.println("베열범위 초과");
		} else {
			arr[3] = 40;
		}
		//****시험
		// ******ArrayIndexOutOfBoundsException 배열 범위 초과 오류 문구
		// 암기 -- 배열에서 부적절한 인덱스에 접근하려고 할때 나오는 문구
		
		// *******negativeArraySizeExection : 배열이 음수의 크기일때 발생 예외
		// 배열의 크기로 음수를 제시했을때 발생하는 예외
	}

}
