public class Thread_LOCAL_ {
    static ThreadLocal<String> tt = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        tt.set("Hello world!");
        Thread one = new Thread_1();
        Thread two = new Thread_2();
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("MAIN " + tt.get());
    }

    static class Thread_1 extends Thread {
        @Override
        public void run() {
            tt.set("Thread_111");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("THREAD_1 " + tt.get());
        }
    }

    static class Thread_2 extends Thread {
        @Override
        public void run() {
            tt.set("Thread_222");

            System.out.println("THREAD_2 " + tt.get());
        }
    }
}
