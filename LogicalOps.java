public class LogicalOps {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a < b && b > 5);  // true
        System.out.println(a > b || b == 20); // true
        System.out.println(!(a == 10));      // false
    }
}

