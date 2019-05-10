package swap;
/* 
 * method call by reference
				  value
 */

public class SwapTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + ":" + b);
		swap(a, b);
		System.out.println(a + ":" + b);
		
		
		Value v1 = new Value();
		v1.val = 10;
		Value v2 = new Value();
		v2.val = 20;
		
		System.out.println("============================");
		
		System.out.println(v1.val + ":" + v2.val);
		swap(v1, v2);
		System.out.println(v1.val + ":" + v2.val);
		
		
	}

	static void swap(int m, int n) {
		int tmp = m;
		m = n;
		n = tmp;
	}

	static void swap(Value c, Value d) {
		int tmp = c.val;
		c.val = d.val;
		d.val = tmp;
	}
}
