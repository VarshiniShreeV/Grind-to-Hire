import java.util.Scanner;

public class CodeForce_1985_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(creatingWords(in.next(), in.next()));
        }
    }
    public static String creatingWords(String a, String b){
        StringBuilder result = new StringBuilder();
        result.append(b.charAt(0));
        result.append(a.charAt(1));
        result.append(a.charAt(2));
        result.append(" ");
        result.append(a.charAt(0));
        result.append(b.charAt(1));
        result.append(b.charAt(2));
        return result.toString();
    }
}