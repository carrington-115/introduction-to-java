import java.util.Scanner;

class QuickStart {

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);
        sc.close();
    }

    void greetings(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickStart obj = new QuickStart();
        System.out.println("What is your name?");
        String name = sc.next();
        obj.greetings(name);
        obj.userInput();
        sc.close();
    }
}
