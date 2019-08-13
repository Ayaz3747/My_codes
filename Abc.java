import java.util.Scanner;
import java.lang.*;
public class Abc {
    public static void main(String []a){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

      //  String s = obj.nextLine();
        String s = null;
        for(int x=0; x<=n; x++){

            s = obj.nextLine();
            if(s.length()<=10){
                System.out.println(s);
            }
            else {
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.println(s.charAt(s.length()-1));

            }
        }


       // System.out.println(l);



    }
}
