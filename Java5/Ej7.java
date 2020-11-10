
public class Ej7 {
	
	public static void main (String[] args) {
		  int contador = 0;
      int codigo = 3421;
      do{
   
      System.out.println("introduzca el código de seguridad");
      int codigoin = Integer.parseInt(System.console().readLine());
    
        if (codigo == codigoin){
        System.out.print("Felicidades, has desbloqueado la caja");
        break;
        }
        else {
        
         contador++;
         if (contador == 4){
         System.out.println("Te has equivocado demasiadas veces");}
         else {
        System.out.println("Intente de nuevo");
        
      }
    }
    }
    while ( contador < 4);
}
}

