package Oct.Ex7_Operators;

public class Lab009 {
    public static void main(String[] args) 
        // Ternary operator
        int a = 20;
        int b = 300;
        int c = 80;

        String result = a > b ? "A is greater than B" : b > c ? "B is greater than C": "C is greater than B" ;
        System.out.println(result);
    }
}