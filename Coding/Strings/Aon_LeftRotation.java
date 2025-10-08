import java.util.Scanner;

public class Aon_LeftRotation{
    pubic static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        while(in.hasNextInt()){
            strings.add(in.next());
        }
        int l = strings.size()-1;
        int n = Integer.parseInt(strings.get(l));
        strings.remove(l);
        l--;
        for(int i=0;i<l;i++) System.out.print(Strings.get((i+n)%l) + " ");
    }
}