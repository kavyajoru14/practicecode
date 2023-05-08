package Day5task;

public class ThreadExample {
    
    public static void main(String[] args) {
        
        // Create a new Thread object
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // This code will run in a new Thread
                System.out.println("Hello from a new Thread!");
            }
        });
        
        // Start the Thread
        thread.start();
    }
    
}
