package string;
class SuperClass{
    void method() throws NullPointerException{
           System.out.println("superClass method");
    }
}

class SubClass extends SuperClass{
    void method() throws RuntimeException{
           System.out.println("SubClass method");
    }
}
 
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com
 * Main class */
public class ExceptionTest {
    public static void main(String[] args) {
           SuperClass obj=new SubClass();
           obj.method();
    }
}
 