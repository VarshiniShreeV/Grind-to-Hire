import java.util.Scanner;

public class CodeForce_1216_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] words = in.next().toCharArray();
        int count = 0;
        
        for(int i=0;i<n-1;i+=2){
            if(words[i]==words[i+1]){
                if(words[i+1]=='a') words[i] = 'b';
                else words[i+1] = 'a';
                count++;
            }

        }
        System.out.println(count);
        System.out.print(new String(words));

        in.close();
    }
}