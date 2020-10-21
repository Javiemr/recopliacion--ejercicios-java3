


public class Ej2 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduce el número de euros para pasar a pesetas: ");
    linea = System.console().readLine();
    int num;
    num = Integer.parseInt(linea);
    
    
    double pesetas = num * 166.386;
    System.out.print(pesetas + " pesetas");
    }
}
