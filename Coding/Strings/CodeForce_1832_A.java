import java.util.Scanner;

public class CodeForce_1832_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            String s = in.next();
            if(isPalindrome(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
    public static boolean isPalindrome(String s){
        boolean flag = false;
        for(int i = 1;i<s.length()/2;i++){
            if(s.charAt(0)!=s.charAt(i)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}