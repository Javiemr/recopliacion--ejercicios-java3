
public class Ej11 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduce Kbs para pasar a Mbs: ");
    linea = System.console().readLine();
    int Kbs;
    Kbs = Integer.parseInt(linea);
    
    double conversor = Kbs / 1024;
    System.out.println("Los Kbs introducidos son: " + conversor + " Mbs");
    }
}
