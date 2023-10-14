import java.util.Scanner;
public class Operators {
    
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int s,e,w;
        s = sc.nextInt();
        e = sc.nextInt();
        w = sc.nextInt();

        while(s<=e)
        {
            int celsius = (5* (s-32))/9;
            System.out.println(s +"  "+celsius);
            s = s+w;
        }
    }
}
