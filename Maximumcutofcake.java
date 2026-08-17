import java.util.Scanner;
public class Maximumcutofcake {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of cuts of the cake: ");
        int n=sc.nextInt();
        int sum=(n*(n+1)/2)+1;
        
        System.out.println(sum);
    }
}
