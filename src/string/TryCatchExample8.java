package string;

public class TryCatchExample8 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
  
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("jjkjk---"+e);  
        }  
        System.out.println("rest of the code");  
        m1();
    }

	private static void m1() throws NullPointerException {
		// TODO Auto-generated method stub
		
	}  
      
}  