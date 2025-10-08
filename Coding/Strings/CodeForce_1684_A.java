import java.util.Scanner;

public class CodeForce_1684_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            String n = in.next();
            if(n.length()==2){
                System.out.println(Integer.parseInt(n)%10);
            }
            else if(n.length()>2){
                int min = 10;
                for(char c : n.toCharArray()){
                    int num = c - '0';
                    if(min>num) min=num;
                }
                System.out.println(min);
            }
        }
    }
}