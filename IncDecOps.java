public class IncDecOps {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("n = " + n);

        System.out.println("n++ = " + (n++)); // prints 5, then n becomes 6
        System.out.println("++n = " + (++n)); // increments to 7 then prints 7

        System.out.println("n-- = " + (n--)); // prints 7, then n becomes 6
        System.out.println("--n = " + (--n)); // decrements to 5 then prints 5
    }
}
