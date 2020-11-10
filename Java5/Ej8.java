public class Ej8 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 1;
    while(contador <= 10) {
      int tabla = num * contador;
      System.out.println(num + " x " + contador + " = " + tabla);
      contador++;
    }
  }
}
