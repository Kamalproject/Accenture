import java.util.Scanner;
public class findprimenumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int start=sc.nextInt();
        System.out.print("Enter second number ");
        int end=sc.nextInt();
        
        for(int i=start;i<=end;i++){
            int count=1;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
