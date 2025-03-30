package academy.devdojo.java.javacore.Aintroducaoclasses.teste;

import academy.devdojo.java.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carroHb20 = new Carro();

        System.out.println("Hb20");
        carroHb20.nome = "\nHB20";
        carroHb20.ano = 2025;
        carroHb20.modelo = "HB20 Top";

        Carro carroCivic = new Carro();
        carroCivic.nome = "Honda Civic";
        carroCivic.ano = 2025;
        carroCivic.modelo = "Honda Civic HiperBlaster";

        // Posso solicitar a um objeto que referencie outro, porém o valor de memória ficará perdido. Ex.:
        // carroCivic = carroHb20;

        System.out.println(carroHb20.nome + " " + carroHb20.modelo + " " + carroHb20.ano);

        System.out.println("-------------------------------------------");

        System.out.println(carroCivic.nome + " " + carroCivic.ano + " " + carroCivic.modelo);


    }

}
