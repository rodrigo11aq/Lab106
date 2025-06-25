import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Diferencia entre el valor máximo y mínimo de un array");
        Scanner read = new Scanner(System.in);
        //int arreglo[] = {1, 6, 8, -9, 7, 10, 12};
        System.out.println("Introduce el tamaño del arreglo: ");
        int tam_arreglo= read.nextInt();
        read.nextLine();

        if (tam_arreglo>0) {
            int[] arreglo = new int[tam_arreglo];

            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Introduce el número en el índice " + i);
                arreglo[i] = read.nextInt();
                read.nextLine();
            }

            int maxnum = arreglo[0];
            int minnum = arreglo[0];

            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] < minnum) {
                    minnum = arreglo[j];
                }
                if (arreglo[j] > maxnum) {
                    maxnum = arreglo[j];
                }
            }
            System.out.println("El valor máximo es: "+maxnum);
            System.out.println("El valor mínimo es: "+minnum);
            System.out.println(("La diferencia entre el valor mínimo y el máximo es: " +(maxnum-minnum)));
            read.close();
        }else{
            System.out.println("Introduce un tamaño válido");
        }

    }
}