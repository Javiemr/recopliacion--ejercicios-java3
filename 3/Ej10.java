
public class Ej10 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduce Mbs para pasar a Kbs: ");
    linea = System.console().readLine();
    int Mbs;
    Mbs = Integer.parseInt(linea);
    
    int conversor = Mbs * 1024;
    System.out.println("Los Mbs introducidos son: " + conversor + " Kb");
    }
}
