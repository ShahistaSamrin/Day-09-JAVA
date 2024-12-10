/* VISHWESH//INPUT
   IHEH //OUTPUT  */
import java.util.*;
public class oddcharinstring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String ans=" ";
        for(int i=0;i<a.length();i+=3)
        {
            ans+=a.charAt(i);
        }
        System.out.println(ans);
    }
}