class FirstThread extends Thread {
  public void run() {

    for (int i = 0; i < 200; i++) {
      System.out.println("hi");
    }
  }
}
/*
 * In case of normal class the JVM executes one method after other But when we
 * extend normal class to Thread the JVM Executes two methods paralally: the
 * Scheduler allots some time for first method paralally some time for second
 * method and again to first method It works on time allotments for multiple
 * threads at a time. That is the use of threads we can perform multitasking by
 * time Sharing.
 * 
 * for that we need to have run() method in thread classes and start() method in
 * main method.
 * 
 * For Example run the code u will see that timeSharing
 */

class SecondThread extends Thread {
  public void run() {
    for (int i = 0; i < 200; i++) {
      System.out.println("hello");
    }
  }
}

class MultiThread {
  public static void main(String args[]) {
    FirstThread obj1 = new FirstThread();
    SecondThread obj2 = new SecondThread();

    obj1.start();
    obj2.start();
  }
}
