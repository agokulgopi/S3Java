import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,count;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of times:");
        count=sc.nextInt();
        System.out.print("Fibonacci Series:" +n1 + " " +n2);
        for (int i=2;i<=count;i++) {
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
