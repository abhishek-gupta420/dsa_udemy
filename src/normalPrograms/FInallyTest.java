package normalPrograms;

public class FInallyTest {

    static int number() {
        int res = 0;
        try {
            int a = 10/0;
        } catch (Exception e) {
            return  1;
        } finally {
            System.out.println("I'll execute @ any cost");
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(number());
    }
}
