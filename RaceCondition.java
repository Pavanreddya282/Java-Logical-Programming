class Counter {
  int count;
  public synchronized void increament() {
    count++;
  }
}
class RaceCondition {
  public static void main(String a[]) {

    Counter c = new Counter();

    // inner class using lamda expressions
    Runnable ft = () ->
      {
      for (int i = 0; i < 20000; i++) {
        c.increament();
      }
      };
    Runnable st = () -> {
      for (int i = 0; i < 20000; i++) {
        c.increament();
      }
    };

    Thread t1 = new Thread(ft);
    Thread t2 = new Thread(st);

    t1.start();
    t2.start();

    // join the 2 thread at one point
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e){
      e.printStackTrace();
    }
    

    System.out.println(c.count);
  }
}