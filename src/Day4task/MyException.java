package Day4task;

class MyException extends Exception {
	 public MyException(String message) {
	     super(message);
	 }


	 public static void main(String[] args) {
	     try {
	         throw new MyException("This is a custom exception.");
	     } catch (MyException e) {
	         System.out.println("Caught exception: " + e.getMessage());
	     }
	 }
	}
