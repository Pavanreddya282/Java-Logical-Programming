class Str15RevStrWord{
  public static void main(String args[]){
    String str="Hi my name is Pavan I am taking training in bitlabs";
    String words[] = str.split(" ");
    String reverse="";
    int j;

    for (int i = str.length()-1; i >=0; i--) {
      for (j = 0;j<str.length()-1;j++){
        words[j]=words[i];
      }
      
    }
    for (int i=0;i<str.length();i++){
      System.out.println("The reverse of string is : " + words[j]);
    }
    
  }
}
// Unfinished