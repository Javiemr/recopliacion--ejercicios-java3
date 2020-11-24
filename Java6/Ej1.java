

public class Ej1 {
	
	public static void main (String[] args) {
		System.out.println("Se mostrará la suma de 3 dados aleatorios");

   double a = Math.random()*6 + 1;
   a = (int)a;
   double b = Math.random()*6 + 1;
   b = (int)b;
   double c = Math.random()*6 + 1;
   c = (int)c;
   int d = (int)a + (int)b + (int)c;
   System.out.print(d);
   
    }
	}


