package ch12;

record Members(String id, String name, int age) {
	//private String id;
	//private String name;
	//private String age;
}
public class RecordEx {

	public static void main(String[] args) {
		 Members m = new Members("winter", "눈송이", 25);
		 System.out.println(m.id());
		 System.out.println(m.name());
		 System.out.println(m.age());
		 System.out.println(m.toString());
		 System.out.println();
		 
		 Members m1 = new Members("winter","눈송이",25);
		 Members m2 = new Members("winter","눈송이",25);
		 System.out.println("m1.hashCode(): "+m1.hashCode());
		 System.out.println("m2.hashCode(): "+m2.hashCode());
		 System.out.println("m1.equals(m2): "+m1.equals(m2));
	}
}
