import java.util.Scanner;

public class CodeForce_1216_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int count = 0;
        char[] words = s.toCharArray();
        
        for(int i=0;i<n-1;i+=2){
            if(words[i]==words[i+1]){
                if(words[i+1]=='a') words[i] = 'b';
                else words[i+1] = 'a';
                count++;
            }

        }
        System.out.println(count);
        // String res = "";
        // for(char c:words) res+= c;
        System.out.print(new String(words));

        in.close();
    }
}