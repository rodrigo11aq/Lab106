import java.util.Scanner;

public class Cuadratica {
    public static void main(String[] args) {
        System.out.println("Calcula el result de x^2+[(4y/5)-x]^2");
        Scanner read=new Scanner(System.in);
        System.out.println("Introduce el valor de x: ");
        double x=read.nextInt();
        System.out.println("Introduce el valor de y: ");
        double y=read.nextInt();
        double result =x*x+Math.pow((4*y/5)-x,2);
        System.out.println("El resultado de la operación es: " + result);
    }
}
