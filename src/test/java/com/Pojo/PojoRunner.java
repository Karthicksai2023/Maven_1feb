package com.Pojo;

public class PojoRunner {
	public static  void main(String[] args) {
     Pojo a = new Pojo();
     
     a.setAge(34);
     a.getAge();
     a.setName("Rosan");
     String name = a.getName();
     System.out.println(name);
		
		
	}

}
