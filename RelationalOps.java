import java.util.*;

public class RelationalOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " > " + y + " = " + (x > y));
        System.out.println(x + " < " + y + " = " + (x < y));
        System.out.println(x + " == " + y + " = " + (x == y));
        System.out.println(x + " != " + y + " = " + (x != y));
    }
}

