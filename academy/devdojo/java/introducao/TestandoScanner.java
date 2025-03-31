package academy.devdojo.java.introducao;
import java.util.Scanner;

public class TestandoScanner {
    public static void main(String[] args) {
        //Aprendendo a usar scanner.

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();

        sc.close();

        System.out.println(nome + " " + idade);

    }
}
