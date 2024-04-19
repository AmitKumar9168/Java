import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int n,r,sum=0,temp;
        System.out.println("Enter a number to check armstrong");
        Scanner myobj = new Scanner(System.in);
        n= myobj.nextInt();
         temp=n;
         while (n>0) {
            r=n%10;
            sum = sum+(r*r*r);
            n=n/10;

         }
         if(temp==sum){
            System.out.println("Armstrong");
         }
         else{
            System.out.println("None");
         }

    }
}
