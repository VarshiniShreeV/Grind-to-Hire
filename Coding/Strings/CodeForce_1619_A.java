import java.util.Scanner;

public class CodeForce_1619_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(isSquareString(in.next()));
        }
    }
    public static String isSquareString(String s){
        if(s.length()%2!=0) return "NO";
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=(s.charAt(i+(n/2)))) return "NO";
        }
        return "YES";
    }
}