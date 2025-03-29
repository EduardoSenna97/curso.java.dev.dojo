package academy.devdojo.java.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {

        /*

        Arrays multidimensionais são "Arrays de Arrays"; arrays lincados onde você
        pode navegar sobre todas as posições que eles têm.

        1,2,3,4,5 MESES
        31,28,31,30 DIAS

        Preciso linckar esses dois arrays. Segue sintaxe abaixo após comentários:

        O primeiro array precisa ter o tamanho, porém o segundo não é necessário agora.

        As posições do primeiro array fazem referência aos outros arrays. A base está fazendo referência aos outros.

         */

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------");

        //Aplicando o foreach nos arrays multidimensionais.

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
        /* Testando para ver se aprendi

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int [][] numeros = new int[2][3];
        numeros[0][0] = 25;
        numeros[0][1] = 26;
        numeros[0][2] = 27;
        numeros[1][0] = 28;
        numeros[1][1] = 29;
        numeros[1][2] =30;

        for (int[] arrbas : numeros) {
            for (int num : arrbas) {
                System.out.println(num);

            }

        }
        */
    }
}
