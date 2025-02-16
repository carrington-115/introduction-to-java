import java.util.Scanner;

public class Loops {
    public String[] userAccountNames() {
        String[] names = { "Fru", "Mark", "Carrington", "Chei" };
        return names;
    }
}

class ExecuteFile {
    void add_name(String[] names, int position) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        names[position] = name;
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
        sc.close();
    }
}
