/*
* 
* * 
* * * 
* * * * 
* * * * *  
*/

/*
class Practice24Patterns{
  public static void main(String args[]){
    int i,j;
    for(i=1;i<=5;i++){   //outer loop for rows
      for(j=1;j<=i;j++){ //inner loop for cols
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
*/
/*
* * * * * 
* * * * 
* * * 
* * 
* 
*/
/*
class Practice24Patterns{
  public static void main(String args[]){
    int i,j;
    for(i=5;i>=1;i--){   //outer loop for rows
      for(j=1;j<=i;j++){ //inner loop for cols
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
*/
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/
/*
class Practice24Patterns{
  public static void main(String args[]){
    int i,j;
    for(i=1;i<=5;i++){   //outer loop for rows
      for(j=1;j<=i;j++){ //inner loop for cols
        System.out.print(" *");
      }
      System.out.println();
    }
    for(i=5-1;i>=1;i--){   //outer loop for rows
      for(j=1;j<=i;j++){ //inner loop for cols
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
*/
/*
        * 
      * * 
    * * * 
  * * * * 
* * * * *
*/
/*
class Practice24Patterns{
  public static void main(String args[]){
    int i,j;
    for(i=0;i<5;i++){   //for loop for row
      for(j=2*(5-i);j>=0;j--){
        System.out.print(" ");
      }
      for(j=0;j<=i;j++){
        System.out.print(" *");  // for loop for col
      }
      System.out.println();
    }
  }
}
*/
/*
* * * * *
  * * * *
    * * *
      * *
        *
*/
class Practice24Patterns{
  public static void main(String args[]){
    int i,j,k;
    for(i=5;i>=1;i--){   //outer loop for rows
      for(j=5;j>i;j--){ //inner loop for cols
        System.out.print(" ");
      }
      for(k=1;k<=i;k++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
} // Unfinished output
