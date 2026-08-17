import java.util.Scanner;
class countvowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toLowerCase();
        char vowel[]={'a','e','i','o','u'};
        int count=0;
        for(int i=0; i<str.length();i++){
            for(int j=0;j<vowel.length;j++){
                if(str.charAt(i)==vowel[j]){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
}