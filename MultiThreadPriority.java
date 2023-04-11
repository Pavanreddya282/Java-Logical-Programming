class FirstThread extends Thread {
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

class SecondThread extends Thread {
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

class MultiThreadPriority {
  public static void main(String a[]) {

    FirstThread ft = new FirstThread();
    SecondThread st = new SecondThread();

    ft.start();
    /*
     * try { Thread.sleep(10); } catch (InterruptedException e) {
     * e.printStackTrace(); }
     */
    st.start();
  }
}

/*
 * In case of Thread.sleep(10) we can assign the values or we can use
 * MIN_PRIORITY, NORM_PRIORITY, and MAX_PRIORITY . which means 1 is min, 5 is
 * norm, and 10 is max
 * 
 * by default the priority will be 5 which is normal.
 */