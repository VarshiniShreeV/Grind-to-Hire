import java.util.Scanner;

public class Leetcode_67 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        Leetcode_67 obj = new Leetcode_67();
        System.out.print(obj.addBinary(a, b));

    }

    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int carry = 0;

        StringBuilder s = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || carry > 0) {
            int sum = carry;
            if (n1 >= 0) sum += a.charAt(n1--) - '0';
            if (n2 >= 0) sum += b.charAt(n2--) - '0';

            s.append(sum % 2);
            carry = sum / 2;
        }
        return s.reverse().toString();
    }

}
