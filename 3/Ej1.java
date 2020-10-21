
/*
 * Intentar usar la herramienta parse
 * 
 * 
 * 
 * */

public class Ej1 {
  public static void main (String[] args) {
    String parse;
    System.out.print("Introduce un numero: ");
    parse = System.console().readLine();
    int num1;
    num1 = Integer.parseInt( parse );
    
    String parse2;
    System.out.print("Introduce otro número: ");
    parse2 = System.console().readLine();
    int num2;
    num2 = Integer.parseInt( parse2 );
    int mult = num1 * num2;
    System.out.print("La multiplicacion es: " + mult);
    }
}
