import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int digit,reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        while (num!=0) {
            digit=num%10;
            reverse=(reverse*10)+digit;
            num/=10;
        }
        System.out.println("Reversed Number is "+reverse);
    }
}
