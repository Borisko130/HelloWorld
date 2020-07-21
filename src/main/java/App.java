import java.util.Scanner;

public class App {
    public static void main(String[] args){
        name();
    }

    public static void name(){
        Scanner scanner = new Scanner(System.in);
        String s;

        System.out.println("Please enter your name");
        s = scanner.nextLine();
        System.out.println("Hello, " + s);
    }
}
