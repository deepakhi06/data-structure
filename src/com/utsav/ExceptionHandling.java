package com.utsav;

/*Advantages of using inner classes as exceptions - 
1. Foremost advantage is that if you developer has written some doubtful message 
   text, then also you can clearly observe that what was actually wrong.
2. You can use instance-of comparison in different situation where you handle 
   different exceptional scenarios.
3. You don’t need to send single exception for a large set of exceptional conditions.
4. Its easy to write unit test cases for negative cases where you know the exact 
   exception class, you should expect.
5. Logging is more meaningful and informative.*/

public class ExceptionHandling{

	public static void main(String[] args) {
		
		try
        {
            throw new DBException.NoData("No row found for id : x");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}
}

/*Make this class abstract so that developers are forced to create
suitable exception types only*/
@SuppressWarnings("serial")
abstract class BaseException extends Exception {
	
	//Each exception message will be hold here
    private String message;
 
    public BaseException(String msg)
    {
        this.message = msg;
    }
    //Message can be retrieved using this accessor method
    public String getMessage() {
        return message;
    }
}
class DBException {
	
	//SQL execution error
    public static class BadExecution extends BaseException
    {
        private static final long serialVersionUID = 3555714415375055302L;
        public BadExecution(String msg) {
            super(msg);
        }
    }
    //No data exist where we expect at least one row
    public static class NoData extends BaseException
    {
        private static final long serialVersionUID = 8777415230393628334L;
        public NoData(String msg) {
            super(msg);
        }
    }
    //Multiple rows exist where we expect only single row
    public static class MoreData extends BaseException
    {
        private static final long serialVersionUID = -3987707665150073980L;
        public MoreData(String msg) {
            super(msg);
        }
    }
    //Invalid parameters error
    public static class InvalidParam extends BaseException
    {
        private static final long serialVersionUID = 4235225697094262603L;
        public InvalidParam(String msg) {
            super(msg);
        }
    }
}
