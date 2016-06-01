package exception;

public class Rethrowing {

	public static void f() throws MyException{
		throw new MyException();
	}
	
	public static void h() throws MyException{
		
		try{
			f();
		}catch (MyException e){
			e.printStackTrace(System.out);
			
			MyException e1 = new MyException();
			e1.initCause(new NullPointerException());
			//throw e1;
			StackTraceElement[] sta = e1.getStackTrace();
			for (StackTraceElement s :sta){
				System.out.println(s.getMethodName());
			}
			throw new RuntimeException(new NoSuchFieldException());
		}
		
	}
	
	public static void g() throws MyException{
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);
			
			throw (MyException)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			h();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}catch (RuntimeException e2){
			e2.getCause().printStackTrace(System.out);
			System.out.println("OVER");
		}
		
//		try{
//			g();
//			
//		}catch(MyException e){
//			e.printStackTrace(System.out);
//		}
		
		
	}

}
