package exception;

public class MyClass {

	public void dangerMethod() throws MyException {
		System.out.println("normal");
		
		boolean isDanger = true;
		if(isDanger) {
			throw new MyException();
		}
		
		
		
	}
}
