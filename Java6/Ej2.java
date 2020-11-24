
public class Ej2 {
	
	public static void main (String[] args) {
    System.out.println("Se va a dar una carta de la baraja francesa : ");
    double a = Math.random()*4 + 1;
    String tipo = "";
   a = (int)a;
   switch ((int)a){
     case 1:
        tipo = "Diamantes";
        break;
		  case 2:
         tipo = "Corazones";
         break;
         case 3:
         tipo = "Picas";
         break;
         case 4:
         tipo = "Tréboles";
         break; }
         
     double b = Math.random()*13 + 1;
     b = (int)b;
     String seguro = "";
     if (b > 10 || b == 1){
       switch ((int)b){
         case 11:
         seguro = "J";
         b = 0;
         break;
         case 12:
         seguro = "Q";
         b = 0;
         break;
         case 13:
         seguro = "K";
         b = 0;
         break;
         case 1:
         seguro = "A";
         b = 0;
         break;
         
       }
     }
     if (b == 0){
       System.out.print("Tu carta es la " + seguro + " de " + tipo );
       
     }
     else {
     System.out.print("Tu carta es el " + (int)b + " de " + tipo);
   }
       
           
	
}

}
