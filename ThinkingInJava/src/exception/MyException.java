package exception;

public class MyException extends Exception{

	public MyException(){	
	}
	
	public MyException(String msg){
		super(msg);
	}
	
	public MyException(Throwable e){
		super(e);
	}
}