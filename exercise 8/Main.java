package javaapplication28;

class PrintThread implements Runnable {
    private static int counter = 1;
    private static final int MAX_COUNT = 100;
    private final int threadId;
    private final int numThreads;

    public PrintThread(int threadId, int numThreads) {
        this.threadId = threadId;
        this.numThreads = numThreads;
    }
    public void run() {
        while (counter <= MAX_COUNT) {
            synchronized (PrintThread.class) {
                if (counter % numThreads == threadId) {
                    for(int i=0;i<3;i++){
                    System.out.print( counter+"\t");
                    counter++;
                }
                    System.out.println();
            }
        }
    }
}}

public class Main {
    public static void main(String[] args) {
        int numThreads = 3;

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new PrintThread(i, numThreads));
            thread.start();
        }
    }
}