package AreasFigu;
import java.util.Scanner;
public class AreasFiguras {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("CALCULAR AREAS");
       System.out.println("1: Cuadrado");
       System.out.println("2:  Círculo");
       System.out.print("Elige una figura: ");
       int opcion = entrada.nextInt();
       if (opcion == 1) {
           System.out.print("Ingresa el lado:  ");
           double lado = entrada.nextDouble();
           double area = lado * lado;
           System.out.println("El area es: " + area);
       } else if (opcion == 2) {
           System.out.print("Ingresa su radio: ");
           double radio = entrada.nextDouble();
           double area = Math.PI * radio * radio;
           System.out.println("El area es: " + area);
       } else {
           System.out.println(“Error, opción incorrecta, vuelva a ingresar");
       }
       entrada.close();
       //prueba de ramas 
   }
}

