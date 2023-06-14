import java.util.Locale;
import java.util.Scanner;

public class App {
    private static final int BR = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Diga olá para o world");

        resposta = sc.next();
        if (resposta == "ola") {
            System.out.println("Hello World!");
        } else {
            System.out.println("Chat ein menor");
        }

        System.out.println("Bom dia!");
        System.out.print("Buenas noitches");

        int e = 432342;

        System.out.println(e);

        double i = 123.1231;

        System.out.printf("¨%.2f¨n", i );

        System.out.printf("¨%.4f¨n", i );

        

    }
}