public class Calculate {
    public static void main(String[] args) {
        final int a = 5;
        final int b;
        b = 25;

        int result = a * b; 

        System.out.println("Resultatet af " + a + " * " + b + " er: " + result);

        // virker kun med ' java --enable-preview Calculate ' i terminalen
        // System.out.println(STR. "Her er resultatet af \{a} * \{b} = \{result}");

        System.out.printf("Resultatet igen, af %d * %d er: %d", a,b,result);
    }
}