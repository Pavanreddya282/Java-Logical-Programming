import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

class CollectionsStream {

  public static void main(String args[]) {

    List<Integer> nums = Arrays.asList(4, 8, 2, 9, 3, 6, 7);

    
    Stream<Integer> s1 = nums.stream(); 
    Stream<Integer> s2 = s1.filter(n -> n%2==0);
    Stream<Integer> s3 = s2.map(n -> n*2);
    // the moment we use s3 the s2 Stream is no more

    int result =s3.reduce(0, (c,e) -> c+e);

    //s1.forEach(n -> System.out.println(n));
    //s2.forEach(n -> System.out.println(n));
    //s3.forEach(n -> System.out.println(n));

    System.out.println(result);

    
  }
}