package simpleprograms;
import java.util.Scanner;
public class patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
       
        while(i<=n)
        {
            char p = (char)('A'+n-i);
            int j=1;
            
            while(j<=i)
            {
                System.out.print(p);
                 j++;
                p = (char)(p+1);   
            }
            System.out.println();
            i++;
        }
    }
}
