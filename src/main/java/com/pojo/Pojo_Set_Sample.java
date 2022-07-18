package com.pojo;

public class Pojo_Set_Sample {
	
	public static void main(String[] args) {
		
		Pojo_Get_Sample p=new Pojo_Get_Sample();
		
		int a=p.getA();
		System.out.println("Before Set:"  +a);
		
		
		p.setA(50);
		int a2 = p.getA();
		System.out.println("After set:" +a2);
		
		
		
	}

}
