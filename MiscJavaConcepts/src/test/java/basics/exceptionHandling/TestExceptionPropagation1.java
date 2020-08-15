package basics.exceptionHandling;
class TestExceptionPropagation1{  
	void m() {  // its thowing the exception but it does not have handling
		int data=50/0;  
		System.out.println("I am M Will I be Executed?");
	}  
	
	void n(){ 
	
			m();
			
	
		
		
	} 
	
	void p(){  
		 
			n();  
	
	}  
	
	public static void main(String args[]){  
		TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		obj.p();  
		System.out.println("normal flow...");  
	}  
}