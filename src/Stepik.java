import java.util.Scanner;

public class Stepik {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            text = text.replaceAll("[^a-zA-Z0-9]","");
            String sb = new StringBuilder(text).reverse().toString();

            //StringBuilder(sb).reverse.tostring(sb);
            //System.out.println(sb);
            //if (text == sb) System.out.println("YES");


                else System.out.println("NO");




        }}

