/*  R//input                  r
    true //if((c&32)!=0)     false //if((c&32)==0)   */
import java.util.*;
public class toggling1{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    //splitting a sentence
    char c=s.next().charAt(0);
    c^=32;
    System.out.println((c&32)!=0);
  }
}