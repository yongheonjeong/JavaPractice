package ch06;


// static - 객체마다 저장x, 메모리 한곳에서 공유
// final - 최종적인 값, 변경 불가 
// static final -> 주로 상수를 표현 
class Earth{
	static final double EARTH_RADIUS = 6400;
	
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
public class staticFinalMember {

	public static void main(String[] args) {
		 System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "Km");
		 System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA+"km^2");
	}

}
