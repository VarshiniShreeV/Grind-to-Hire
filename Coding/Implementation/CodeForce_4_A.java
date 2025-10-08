import java.util.Scanner;

public class CodeForce_4_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0 && n>2) System.out.print("YES");
        else System.out.print("NO");
    }
}