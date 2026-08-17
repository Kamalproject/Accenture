import java.util.Scanner;
public class mergesortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr1[]={1,4,7,20};
        int arr2[]={3,5,6};
        int n=arr1.length+arr2.length;
        int ans[]=new int[n];
        
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        for(int p=0;p<n;p++){
            System.out.print(ans[p]+" ");
        }
        System.out.println("");
    }
}
