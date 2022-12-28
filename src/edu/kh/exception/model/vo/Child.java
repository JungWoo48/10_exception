package edu.kh.exception.model.vo;

public class Child extends Parent {

	
	@Override
	public void method()  {
		//throws Exception을 할경우 parent에 IOException보다 범위가 크므로 불가능하다
		
		
		//오버라이딩시 
		//예외는 같거나 더 좁은 범위여야한다
		//** 좁은 범위 == 구체적인 범위
		
		
		//FileNotFoundException은
		//IOException의 자식 예외이므로 오버라이딩 가능
		
		//Exception은 
		//IOException의 부모 예외이므로 오버라이딩 불가능
		
		
		System.out.println("오버라이딩된 자식");
	}
}
