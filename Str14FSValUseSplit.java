class Str14FSValUseSplit{
  public static void main(String args[]){
    String str="Hi my name is Pavan I am taking training in bitlabs";
    String words[] = str.split(" ");
    String largestWord = words[0];
    String smallestWord = words[0];
    for (int i=1;i<words.length;i++)
      {
        if( words[i].length() > largestWord.length()){
          largestWord=words[i];
        }
        if( words[i].length() > largestWord.length()){
          smallestWord=words[i];
      }
      }
    System.out.println("The Largest string in given string is : "+largestWord);
    System.out.println("The Largest string in given string is : "+smallestWord);
  }
}