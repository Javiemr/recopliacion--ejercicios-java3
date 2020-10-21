/*
 * Nota1 *0,4 + Nota2 *0,6 = NotaFinal
 * Nota2 = (Nota 1 *0,4 - Notafinal) / 0,6
 * */


public class Ej12 {
  
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduce la nota del primer examen: ");
    linea = System.console().readLine();
    int nota1;
    nota1 = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduce la nota deseada: ");
    linea2 = System.console().readLine();
    int notadeseada;
    notadeseada = Integer.parseInt(linea2);
    
    double nota2 = (notadeseada - nota1 * 0.4) / 0.6;
    System.out.println("La nota que deberías sacar en el siguiente examen es: " + nota2);
    }
}
