import java.util.ArrayList;
import java.util.Scanner;

public class CodeForce_855_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = in.next();
            if(!arr.contains(s)){
                arr.add(s);
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
