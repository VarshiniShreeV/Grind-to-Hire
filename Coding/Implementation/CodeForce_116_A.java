import java.util.Scanner;

public class CodeForce_116_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int passengers = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            passengers -= in.nextInt();
            passengers += in.nextInt();
            if(max<passengers) max=passengers;
        }
        System.out.print(max);
    }
}