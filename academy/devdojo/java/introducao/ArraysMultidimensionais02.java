package academy.devdojo.java.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3};

        arrayInt[0] = new int[2];               //Tudo isso são diferentes maneiras de inicializar o array.
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }

        }

    }
}
