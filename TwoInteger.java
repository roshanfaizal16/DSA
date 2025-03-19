import java.util.*;
public class TwoInteger {
        public int divide(int dividend, int divisor) {
            if(divisor==0)
            return 0;
            if(divisor!=0){
                if(dividend == Integer.MIN_VALUE && divisor == -1)
                return Integer.MAX_VALUE;
            }
            return dividend/divisor;
        }
        public static void main(String[] args) {
            TwoInteger m = new TwoInteger();
            Scanner in =new Scanner(System.in);
            System.out.println("Enter the divident value:");
            int dividend =in.nextInt();
            System.out.println("Enter divisor value:");
            int divisor = in.nextInt();
            System.out.println("Value");
            System.out.println(m.divide(dividend, divisor));
        }
    } 
    

