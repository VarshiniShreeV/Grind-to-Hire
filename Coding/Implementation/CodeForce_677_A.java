import java.util.Scanner;

public class CodeForce_677_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++){
            int val = in.nextInt();
            if(val>h) ans+=2;
            else ans+=1;
        }
        System.out.print(ans);
    }
}