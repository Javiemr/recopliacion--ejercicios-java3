

public class Ej3 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduce el número de pesetas para pasar a euros: ");
    linea = System.console().readLine();
    int num;
    num = Integer.parseInt(linea);
    
    
    double euros = num * 0.006;
    System.out.println(euros + " euros");
    }
}
