package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(222,"aaa","london"));
		ar.add(new Student(242,"ccc","usa"));
		ar.add(new Student(322,"rrr","paris"));
		
		System.out.println("------");
		Collections.sort(ar,new SortRoll());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.print("\n");
		
		Collections.sort(ar,new Sortname());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		

	}

}
