

public class Ej8 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Escriba las horas en una semana: ");
    linea = System.console().readLine();
    int hora;
    hora = Integer.parseInt(linea);
    
    int euros = 12;
    int salario = euros * hora;
    System.out.println("El salario es de: " + salario + " euros");
    }
}
