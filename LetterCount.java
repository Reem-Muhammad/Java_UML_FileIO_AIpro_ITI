import java.io.*;

public class LetterCount{
  public static void main(String[] args){
    int charCount = 0;
    char charToCount = args[0].charAt(0); //gets the 1st char if user passed a string
    try{
      FileReader file = new FileReader("sampleFile.txt");
      int charFromFile;
      //loop until EOF
      while((charFromFile=file.read()) != -1){
        if ((char)charFromFile == charToCount){
          charCount++;
        }
      }
      System.out.print(charCount); //print the no. occurences of the letter in the file
    }
    catch (Exception e){
      System.out.print("error");
    }


  }

}
