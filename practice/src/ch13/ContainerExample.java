package ch13;


//class Container<T> {
//
//	T t;
//	
//	public void set(T t) {
//		this.t = t;
//	}
//	
//	public T get() {return this.t; }
//}


class Container<K,V>{
	K k;
	V v;
	
	public void set(K k,V v) {
		this.k = k;
		this.v = v;
	}
	
	public K getKey() { return this.k; }
	public V getValue() { return this.v; }
}
public class ContainerExample {

	public static void main(String[] args) {

//		Container<String> container1 = new Container<>();
//		container1.set("홍길동");
//		String str = container1.get();
//		
//		Container<Integer> container2 = new Container<Integer>();
//		container2.set(6);
//		int value = container2.get();
//		
//		System.out.println(str + " " + value);
		
		
		Container<String,String> container1 = new Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String,Integer> container2 = new Container<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		
		System.out.println("name1 : "+name1+" "+"job : "+job);
		System.out.println("name2 : "+name2+" "+"age : "+age);
	}

}
