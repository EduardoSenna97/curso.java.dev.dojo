package academy.devdojo.java.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
      /* idade < 15 ~ categoria infantil
         idade >= 15 && idade < 18 ~ categoria juvenil
         idade >=18 ~ categoria adulto
       */

        int idade = 12;

        if(idade<15){
            System.out.println("Categoria Infatil");
        }else if(idade >=15 && idade <18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }

        int idade2 =12;
        String categoria;

        if(idade<15){
            categoria = "Categoria Infatil";
        }else if(idade >=15 && idade <18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        /*
         Uma importante regra do Java é que todas as variáveis que estão dentro de um escopo local
         (dentro de métodos) têm obrigariamente ser inicializadas antes de executá-las. Exemplo:

              if(idade<15){
                       categoria = "Categoria Infatil";
              }else if(idade >=15 && idade <18){
                       categoria = "Categoria Juvenil";
              }

         O programa não vai ser executado pois existe a chance da variável categoria não ser inicializada.
         */


    }
}
