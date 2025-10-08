import java.util.Scanner;

public class Aon_FruitBastket{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = in.nextInt();
        int rs = in.nextInt();

        if(a>m) System.out.print(rs - (a-m));
        if(a<m) System.out.print(rs + (m-a));
    }
}