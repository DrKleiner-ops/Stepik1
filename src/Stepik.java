import java.math.BigInteger;
import java.util.Scanner;

public class Stepik {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int value = in.nextInt();
            int i;
            BigInteger k =BigInteger.ONE;
            BigInteger result=BigInteger.valueOf(1);
            for (i=1; i<=value; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            
                //po =  k.multiply(r);
            }
            
            System.out.println(result);
        }}

