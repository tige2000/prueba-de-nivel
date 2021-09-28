package EjercicioPalabra;

public class PalabraCapIcua {

	public void main (String[] args) {
		
		
	}
	
	private boolean esSimetrica(String palabra) {
		
		int longitudPalabra = palabra.length();
		
		for (int i = 0, j = longitudPalabra - 1; i < longitudPalabra && j >= 0; i++, j--) {
			
			if (palabra.charAt(i) != palabra.charAt(j)) {
				
				return false;
			}
		}
		
		return true;
	}
}


///////////////////////////--- KOTLIN ---///////////////////////
/*

fun esSimetrica(palabra: String) {

   var longitudPalabra = palabra.length
   var i = 0
   var j = longitudPalabra - 1
   
   while (i < longitudPalabra && j >= 0) {
   
      if (palabra.get(i) != palabra.get(j)) {
      
         return false
      }
      
      i++
      j--
   }
   
   return true
}


*/
