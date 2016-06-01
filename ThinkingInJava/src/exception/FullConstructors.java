package exception;

public class FullConstructors {

	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException("g()'s MyException");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FullConstructors fullConstructors = new FullConstructors();
		try{
			f();
		} catch(MyException e1){
			e1.printStackTrace();
			Class class1 = e1.getClass();
			System.out.println(class1.getName());
			System.out.println(class1.getSimpleName());
		}
		try{
			g();
		} catch(MyException e2){
			e2.printStackTrace(System.out);
		}
		
	}

}
