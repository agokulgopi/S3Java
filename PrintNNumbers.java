import java.util.Scanner;

public class PrintNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of N:");
        int a=sc.nextInt();
        for (int i=0;i<=a;i++) {
            System.out.println(i);
        }
    }
}
