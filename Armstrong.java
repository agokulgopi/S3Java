import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int n){
        int temp,last=0,digit=0,sum=0;
        temp=n;
        while (temp>0) {
            temp=temp/10;
            digit++;
        }
        temp=n;
        while (temp>0) {
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if (n==sum) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num+" is Armstrong Number.");
        } else {
            System.out.println(num+" is Not Armstrong.");
        }
    }
}
