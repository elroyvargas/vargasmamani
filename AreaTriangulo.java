import java.util.Scanner;
class AreaTriangulo java{
static Scanner teclado=new Scanner(System.in);
public static void main(String[] arg){
 //definicion de variables u otros
 System.out.println("Ejercicio 01: Area Triangulo");
 int b, h, area;
 //Datos de entrada
 System.out.println("Ingrese Base:");
 b=teclado.nextInt();
 System.out.println("Ingrese Altura:");
 h=teclado.nextInt(); 
 //Proceso
 area=(b*h)/2;
 //Datos de salida
 System.out.prinln("El area es: "+area)
}
}
