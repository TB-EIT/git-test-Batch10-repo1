public class hello_world {

    public static void main(String[] args) {
        var name = new String("Bobert");
        System.out.println("Hello, " + name + "! Nice to meet you! How are you doing?");
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static float div(int a, int b) {
        return a / b;
    }
}
