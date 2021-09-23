package sumarString;

public  class SumarString {

	
	public static void Sumar(String[] letras) {
		Integer suma = 0;
		for (String palabra : letras) {
			try {
				suma += Integer.parseInt(palabra);

			} catch (NumberFormatException nfe) {
				System.err.println("This is not a number: " + palabra);

			}
		}
		System.out.println ("suma: " + suma);

	}
	

	public static void main(String[] args) {

		SumarString.Sumar(new String [] {"1","2","3","4","cinco","6","7","8","9","diez"});
	}
		
}