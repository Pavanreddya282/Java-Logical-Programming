class SamJC3 {
  public static void main(String args[]) {
    int i;
    for (i = 1; i <= 10; i++) {
      if (i == 6) {
        continue;
      } else if (i == 8) {
        continue;
      }
      System.out.println(i);
    }
  }
}