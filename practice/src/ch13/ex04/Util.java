package ch13.ex04;

public class Util { 
//	public static<K,V> V getValue(Pair<K,V> p, K k) {
//		if(p.getKey() == k)
//		{
//			return p.getValue();
//		}else {
//			return null;
//		}
//	}
	
	public static <P extends Pair<K,V>,K, V> V getValue(P p,K k) {
		if(p.getKey() == k) {
			return p.getValue();
		}else {
			return null;  
		}
	}
}
