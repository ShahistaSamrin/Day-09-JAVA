/*  shahista is good girl//input
   [shahista, is, good, girl]  //output  */
import java.util.*;
public class stringsplitting{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    //splitting a sentence
    String a=s.nextLine();
    String sp[]=a.split(" ");
      System.out.println(Arrays.toString(sp));
  }
}