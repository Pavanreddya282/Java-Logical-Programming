import java.io.*;

class FinallyException {
  public static void main(String args[]) throws IOException {
    int num = 0;
    BufferedReader br = null;
    try {
      // InputStreamReader in = new InputStreamReader(System.in);
      br = new BufferedReader(new InputStreamReader(System.in));
      // br = new BufferedReader(in);
      num = Integer.parseInt(br.readLine());
      System.out.println(num);
    } finally {
      br.close();
    }
  }
}