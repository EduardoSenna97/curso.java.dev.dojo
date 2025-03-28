package academy.devdojo.java.introducao;

import java.util.Scanner;

public class AprendendoScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Valor: ");
        double valor = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome);
        System.out.println("Você tem " + idade + " anos. Que legal!");
        System.out.println("Valor em R$" + valor);

        /* Quero colocar isto no Scanner, porém não gera resultado. Verificar com quem sabe

        if(idade <18){
            System.out.println("Você é menor de idade!");
            }else{
            System.out.println("Você é maior de idade!");

         */

    }
}
