package testJava;


import java.awt.SystemColor;
import java.util.Date;
import java.util.Vector;

public class testJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//引用的指向不能改变，而不是引用的内容不能改变。
		final StringBuilder sb1=new StringBuilder("final");
		sb1.append(" const");
		System.out.println(sb1);
		
		

	}
}


