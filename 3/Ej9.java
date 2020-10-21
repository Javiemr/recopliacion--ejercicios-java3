

public class Ej9 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduce el radio del cono: ");
    linea = System.console().readLine();
    int radio;
    radio = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduce la altura: ");
    linea2 = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea2);
    
    double volumen = ((3.14 * radio * radio * altura) / 3);
    System.out.println("El volumen del cono es: " + volumen + " unidades cuadradas");
    }
}
