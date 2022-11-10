import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value of N:");
        int a=sc.nextInt();
        int sum=0;
        for (int i=0;i<=a;i++) {
            sum+=i;
        }
        System.out.println("Sum of N Numbers:"+sum);
    }
}
