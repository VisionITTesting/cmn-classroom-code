package basics.exceptionHandling;
//Example: Throws and throw

import java.io.IOException;

class IAmNotHappyException extends Exception{
	
}

//throw thr
class TestExceptionPropagation2{  
	void m() throws InterruptedException {//throws  
		//UNCOMMENT BELOW LINE WHILE EXPLANATION
	
		//throw new java.io.IOException("device error");//checked exception  
		throw new NullPointerException(); // Un-Checked exception will not give error
		//throw new IAmNotHappyException();
			
		//Thread.sleep(5000);
	
	
	}  
	void n() throws InterruptedException{  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("exception handeled");
		}  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		obj.p();  
		System.out.println("normal flow");  
	}  
} 