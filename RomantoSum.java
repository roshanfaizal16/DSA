import java.util.*;
public class RomantoSum {
    public int solution(String s){
        int num=0;
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            switch (c) {
                case'I' :
                num =1;
                break;
                case'V' : 
                num =5;
                break;
                case'X' :
                num =10;
                break;
                case'L' :
                num =50;
                break;
                case'C' :
                num =100;
                break;
                case'D' :
                num =500;
                break;
                case'H' :
                num =1000;
                break;
            }
            if(4*num<res)
            res-=num;
            else
            res+=num;
        }
        return res;
    }
 public static void main(String[] args) {
    RomantoSum m =new RomantoSum();
     Scanner in = new Scanner(System.in);
     System.out.println("Enter string:");
     String s =in.nextLine();
     System.out.println(m.solution(s));
 }
}
