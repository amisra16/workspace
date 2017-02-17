public class Deadlock {
    
    private String lock1 = "lock1";
    
    private String lock2 = "lock2";
    
    public void method1() {
        synchronized(lock1) {
            // some code
        }
        synchronized(lock2) {
            // some code
        }
    }
    
    public void method2() {
        synchronized(lock2) {
            // some code
        }
        synchronized(lock1) {
            // some code
        }
    }
}