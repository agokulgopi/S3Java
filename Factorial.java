import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int digit,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        while (num!=0) {
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial="+fact);
    }
}
