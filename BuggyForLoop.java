public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x = x + i;
            if (x > 10) {
                break;
            }
            System.out.println(x);
        }
    }
}