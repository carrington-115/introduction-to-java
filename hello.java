import java.util.Scanner;

class QuickStart {

    public int userInput() {
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        sc.close();
        return Integer.parseInt(scanned);
    }

    boolean stringVerify_1(String value, String compare) {
        if (value.equals(compare))
            return true;
        else
            return false;
    }

    boolean stringVerify_2(String value, String compare) {
        if (value == compare)
            return true;
        else
            return false;
    }

    void greetings(String name) {
        System.out.println("Hello " + name);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickStart obj = new QuickStart();
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Comparison 1: " + obj.stringVerify_1(name, "mark"));
        System.out.println("Comparison 1: " + obj.stringVerify_2(name, "mark"));
        sc.close();
    }
}
