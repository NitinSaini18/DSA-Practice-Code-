package simpleprograms;
import java.util.Scanner;
public class mirror_image_pat{
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int space = 1;
            while(space<n+2)
            {
                System.out.print(' ');
                space++;
            }
            int stars=1;
            while(stars<=i)
            {
                System.out.print(stars);
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
