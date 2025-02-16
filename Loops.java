public class Loops {
    public String[] userAccountNames() {
        String[] names = { "Fru", "Mark", "Carrington", "Chei" };
        return names;
    }
}

class ExecuteFile {
    public static void main(String[] args) {
        Loops loopObj = new Loops();
        System.out.println("Hello world");
        String[] names = loopObj.userAccountNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
    }
}
