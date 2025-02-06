import java.util.Scanner;

class QuickStart {

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);
        sc.close();
    }

    public static void main(String[] args) {
        QuickStart obj = new QuickStart();

        int number = 4;
        String name = "mark";
        System.out.println("Hello, World." + number);
        System.out.println("My name is: " + name);
        obj.userInput();
    }
}