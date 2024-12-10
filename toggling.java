/*  R//input
    r//output   */
import java.util.*;
public class toggling{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    //splitting a sentence
    char c=s.next().charAt(0);
    c^=32;
    System.out.println(c);
  }
}