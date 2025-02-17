import java.util.Scanner;

public class Loops {
    public String[] userAccountNames() {
        String[] names = { "Fru", "Mark", "Carrington", "Chei" };
        return names;
    }
}

class ExecuteFile {
    Scanner sc = new Scanner(System.in);

    void add_name(String[] names, int position) {
        String name = sc.next();
        names[position] = name;
    }

    void end_if_number(int number) {
        int count = 0;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while (num != number) {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
        String[] names = new String[5];
        ExecuteFile executor = new ExecuteFile();

        // populating names
        for (int i = 0; i < names.length; i++) {
            executor.add_name(names, i);
        }

        // print out the names
        for (String name : names) {
            System.out.println(name);
        }

        executor.end_if_number(10);
        sc.close();
    }
}
