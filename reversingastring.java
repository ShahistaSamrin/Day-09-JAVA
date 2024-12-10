/*  shahi//input
    ihahs //output  */
import java.util.*;
public class reversingastring{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String a=s.nextline();
    String res=" ";
    for(int i=0;i<a.length();i++)
    res=a.charAt(i)+res;
    System.out.println(res);
  }
}