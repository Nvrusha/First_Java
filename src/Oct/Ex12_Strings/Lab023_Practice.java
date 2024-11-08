package Oct.Ex12_Strings;

public class Lab023_Practice {
    public static void main(String[] args) {
        String str1 = "Hello";                    // Creates or reuses "Hello" in the String pool
        String str2 = "Hello";                    // Reuses the "Hello" from the String pool
        String str3 = new String("Hello"); // Creates a new object on the heap

        System.out.println(str1 == str2);  // true, both refer to the same object in the pool
        System.out.println(str1 == str3);  // false, str3 is a new object in the heap
        System.out.println(str1.equals(str3));  // true, because the content is the same
    }
}
