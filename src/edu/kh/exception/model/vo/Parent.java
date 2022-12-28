package edu.kh.exception.model.vo;

import java.io.IOException;

public class Parent {
	//호출한 곳으로 IOException를 던짐
	public void method() throws IOException{
		//해당 메서드는 IOException를 발생시킬 가능성이 있으므로
		//호출하는 곳에서 예외처리를 해야한다
		
		
		System.out.println("부모 메서드");
		
		throw new IOException();
	}
}
