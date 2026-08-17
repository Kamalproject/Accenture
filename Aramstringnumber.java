import java.util.Scanner;
public class Aramstringnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        
        String num=String.valueOf(number);
        int sum=0;
        int n=num.length();
        int temp=number;
        while(temp!=0){
            int digit=temp%10;
            sum+=(int)Math.pow(digit, n);
            temp/=10;
        }
        if(sum==number){
            System.out.println("Aramstong number");
        }
        else{
            System.out.println("Not an Aramstrong number");
        }
    }
}
