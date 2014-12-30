package testJava.features.polymorphism;

import com.yuanach.util.Print;

class Super{
	private int field=0;
	public int getField(){
		return field;
	}
}

class Sub extends Super{
	private int subfield=1;
	@Override
	public int getField(){
		return subfield;
	}
}

public class Poly {

	public static void main(String[] args) {
		Super s=new Sub();
		System.out.println(s.getField());

	}

}
