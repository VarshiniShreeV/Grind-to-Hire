import java.util.Scanner;

public class CodeForce_1829_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(loveStory(in.next()));
        }
    }
    public static int loveStory(String s){
        String str = "codeforces";
        int count = 0;
        for(int i=0;i<10;i++){
            if(s.charAt(i)!=str.charAt(i)) count++;
        }
        return count;
    }
}