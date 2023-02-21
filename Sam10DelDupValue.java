// Remove consecutive duplicate values from the array
class Sam10DelDupValue {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 2, 3, 4, 4, 5, 5, 6 };
    // int[] arr = {1, 3, 2, 3, 4, 6, 5, 2, 6};
    // int[] arr = {99,64,16,13,99}; // output is same as input
    int n = arr.length;
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != arr[j]) {
        arr[++j] = arr[i];
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
