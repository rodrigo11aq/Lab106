import java.util.Arrays;
import java.util.Scanner;

public class Min_2ndMin {
    public static void main(String[] args) {
        System.out.println("Encuentra los dos valores mínimos de un arreglo");
        Scanner read=new Scanner(System.in);
        System.out.println("Introduce el tamaño del arreglo");
        int size_arreglo= read.nextInt();
        if (size_arreglo<2){
            System.err.println("Error: Introduce un tamaño de arreglo válido");
        }else {
            int[] arreglo= new int[size_arreglo];
            for (int i=0;i<arreglo.length;i++){
                System.out.println("Introduce el número de la posición " +(i+1));
                arreglo[i]=read.nextInt();
            }
            System.out.println(Arrays.toString(arreglo));
            int [] min_nums =new int[2];
            min_nums[0]=Integer.MAX_VALUE;
            min_nums[1]=Integer.MAX_VALUE;

            for(int i=0; i<arreglo.length; i++){
                min_nums[0] =Math.min(min_nums[0], arreglo[i]);
            }

            for(int i=0;i<arreglo.length;i++){
                if(arreglo[i]!=min_nums[0]){
                    min_nums[1]=Math.min(min_nums[1],arreglo[i]);
                }
            }
            System.out.println("El primer valor mínimo es: " + min_nums[0]);
            System.out.println("El segundo valor mínimo es: " +min_nums[1]);

        }

    }
}