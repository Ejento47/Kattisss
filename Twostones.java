import java.util.*;
public class Twostones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.print("Bob");
        else
            System.out.print("Alice");
    }
}
