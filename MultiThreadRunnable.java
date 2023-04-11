
class FirstThread implements Runnable {
  public void run() {

    for (int i = 0; i < 5; i++) {
      System.out.println("hi");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class SecondThread implements Runnable {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class MultiThreadRunnable {
  public static void main(String a[]) {

    Runnable ft = new FirstThread();
    Runnable st = new SecondThread();

    Thread t1 = new Thread(ft);
    Thread t2 = new Thread(st);

    t1.start();
    t2.start();
  }
}