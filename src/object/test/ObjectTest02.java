package object.test;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		
		// == : 두 객체의 동일성
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals : 두 객체의 동질성을 비교한다. (내용비교)
		// Object의 equals() 기본 구현은 == 연산 결과와 같다.
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		// String
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "ABC";
		String str4 = "ABC";
		String str5 = "CBA";
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(str3 == str5);
	
	}
	
}
