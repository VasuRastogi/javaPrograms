package Java.testingJava;
import java.util.Set;

class runs implements Runnable {
    public void run()
    {
        try {
            Thread.sleep(1000);
        }catch (Exception err) {
            System.out.println(err);
        }
    }
}

public class result {
    public static void main(String args[]) throws Exception {
        // starting 10 threads
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new runs());
            t.setName("new_Thread-" + i);
            t.start();
        }
        Set<Thread> tSet = Thread.getAllStackTraces().keySet();
        for (Thread t : tSet) {
            System.out.println("Thread :" + t + ":" + "Thread status : " + t.getState());
        }
    }
}