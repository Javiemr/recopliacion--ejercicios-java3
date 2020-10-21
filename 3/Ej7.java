

public class Ej7 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca la base imponible de un producto: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    
    double extra = base * 0.16;
    double factura = base + extra;
    System.out.print("La factura es: " + factura);
    }
}
