package DSA.Module_1;

public class Module_1 {
    static String hi = "Hello, world!";
    static String hello = "Hello";
    static String world = "world!";

    static public String hello() {
        return hello + ", " + world;
    }

    public static void main(String[] args) {
//        Câu 1:
        System.out.println("Hello, world!");

//        Câu 2:
        System.out.println(hi);

//        Câu 3:
        System.out.println(hello + ", " + world);

//        Câu 4:
        System.out.println(hello());

    }
}
