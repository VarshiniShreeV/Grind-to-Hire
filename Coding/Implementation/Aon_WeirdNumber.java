import java.util.Scanner;

public class Aon_WeirdNumber{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for(int i=1; i<n; i++) if(i%k!=0 && sumOfDigits(i)%k==0) count++;
        System.out.print(count);
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}