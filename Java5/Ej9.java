public class Ej9 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    long num = Integer.parseInt(System.console().readLine());
    long contador = 1;
    long contador2 = 0;
    
    while(contador <= num) {
      contador = contador * 10;
      contador2++;
    }
    System.out.print("El numero introducido tiene " + contador2 + " digitos");
  }
}

