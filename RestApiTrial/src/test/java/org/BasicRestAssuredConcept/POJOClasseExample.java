package org.BasicRestAssuredConcept;

import java.io.Serializable;

// pojo class is a plain old java object,
// below are the characteristics of pojo classes
// note :1)it not implement anything2)it not extend anything 3) no outside resources
//that kind of pure plain class it is pojo class
//in that no-args construtor2)properties must be private 3)public getter and setter
// must be serializable



// sreializable iterface  just give labeling that it is serializabl
public class POJOClasseExample implements Serializable {

	
		private int age;
		private String name;
	

	    public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}  


	public static void main(String[] args) {
		POJOClasseExample po=new POJOClasseExample();
		po.setAge(20);
		po.setName("vaibhav");
		System.out.println(po.getName());
		System.out.println(po.getAge());
	}

}
