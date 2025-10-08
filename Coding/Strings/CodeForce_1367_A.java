import java.util.Scanner;

public class CodeForce_1367_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(shortSubstrings(in.next()));
        }
    }
    public static String shortSubstrings(String s){
        StringBuilder org = new StringBuilder();
        org.append(s.charAt(0));
        for(int i=1;i<s.length()-1;i+=2){
            org.append(s.charAt(i));
        }
        org.append(s.charAt(s.length()-1));
        return org.toString();
    }
}