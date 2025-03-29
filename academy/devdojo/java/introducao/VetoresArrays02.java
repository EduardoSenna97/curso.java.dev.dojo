package academy.devdojo.java.introducao;

public class VetoresArrays02 {
    public static void main(String[] args) {

        //Posso inicializar o Array de formas diferentes.

        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};       //   <-
        int[] numeros3 = new int[]{1,2,3,4,5};


        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);

        //Posso simplificar isso. Segue abaixo:

        }
        for(int num:numeros3){
            System.out.println(num);
            /*
            Aqui foi criado uma variável (num) de referência ao Array, que segue todos os valres;
            O tipo precisa ser estritamente o do Array.
             */

        }
    }
}
