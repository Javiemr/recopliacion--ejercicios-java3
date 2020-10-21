


public class Ej4 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca un numero: ");
    linea = System.console().readLine();
    int num1;
    num1 = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduzca otro numero: ");
    linea2 = System.console().readLine();
    int num2;
    num2 = Integer.parseInt(linea2);
    
    int suma = num1 + num2;
    int resta = num1 - num2;
    double division =  (double)num1 / (double)num2;
    int multiplicacion = num1 * num2;
    
    System.out.println("La suma de los numeros es: " + suma);
    System.out.println("La resta de los numeros es: " + resta);
    System.out.println("La división de los numeros es: " + division);
    System.out.println("La multiplicación de los numeros es: " + multiplicacion);
    }
}
