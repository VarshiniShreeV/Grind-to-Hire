import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class  HackerEarth_CommonPrime{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long n1 = Long.parseLong(st.nextToken());
        long n2 = Long.parseLong(st.nextToken());
        
        long g = gcd(n1, n2);
        
        if (g == 1) {
            System.out.println(-1);
        } else {
            System.out.println(smallestPrimeFactor(g));
        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long smallestPrimeFactor(long n) {
        if (n % 2 == 0) return 2;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return i;
        }
        return n; 
    }
}
