package ch12;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

			HashSet hashSet = new HashSet();
			
			Student s1 = new Student(1,"홍길동");
			hashSet.add(s1);
			System.out.println("저장된 객체 수 : "+hashSet.size());
			
			Student s2 = new Student(1,"홍길동");
			hashSet.add(s2);
			System.out.println("저장된 객체 수 : "+hashSet.size());
			
			Student s3 = new Student(2,"홍길동");
			hashSet.add(s3);
			System.out.println("저장된 객체 수 : "+hashSet.size());
			
			//HashSet은 동등객체를 중복 저장하지 않는 특징이 있다.
	}

}
