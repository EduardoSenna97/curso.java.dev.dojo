package academy.devdojo.java.introducao;

public class OperadorTernario {
    public static void main(String[] args) {

        /*Quero saber quanto de imposto devo pagar na Holanda em 2020 baseado no meu salário anual.

                €0 >= && <= €34.712 paga 9.78%
                € > 34.713 && <=68.507 paga 37.35%
                € >68.507 paga 49.50%                                                               */

        double salarioAnual = 100000;
        double primeiraFaixa = 9.78 / 100;
        double segundaFaixa =  37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;
        if(salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa; //Poderia colocar simplificado: salarioAnual *= primeiraFaixa;
        }else if(salarioAnual >=34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);


        //Operador ternário:

        double salario2 = 7000;
        String mensagemDoar2 = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar2 = "Ainda não tenho condições, mas vou ter!";

        //(condição) ? verdadeiro : falso

        String resultado2 = salario2>5000 ? mensagemDoar2 : mensagemNaoDoar2;

        //tenho que tomar cuidado para não colocar um valor que não seja o mesmo do tipo da variável.

        System.out.println(resultado2);




    }


}
