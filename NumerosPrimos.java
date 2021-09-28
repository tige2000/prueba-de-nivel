package EjercicioNumerosPrimos;

public class NumerosPrimos {

	public static void main(String[] args) {
		
	}
	
	private boolean esPrimo(int numero) {
		
		for (int i = 1; i <= numero; i++) {
			
			if (i != 1 && i != numero) {
				
				if (numero % i == 0) {
					
					return false;
				}
			}
		}
		
		return true;
	}
}

/////////////--- KOTLIN ---//////////////
/*

fun esPrimo(numero: Int) {

   for (i in 1..numero) {
   
      if (i != 1 && i != numero) {
      
         if (numero % i == 0) {
         
            return false
         }
      }
   }

   return true
}

*/ 
