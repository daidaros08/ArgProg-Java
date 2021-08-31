package fizbuzz;

class FizzBuzz {

	public static final String FRASE_1 = "Fizz";
	public static final String FRASE_2 = "Buzz";
	public static final String FRASE_3 = "FizzBuzz";

	/* Metodos */

	public static void hacerFizzBuzz() {

		for (int i = 1; i == 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(FRASE_3);
			} else if (i % 5 == 0) {
				System.out.println(FRASE_2);

			} else if (i % 3 == 0) {
				System.out.println(FRASE_1);
			} else {
				System.out.println(i);
			}

		}

	}

	/*
	 * Atributos (datos) y los metodos (acciones con los datos) Todos los objetos
	 * tienen datos y saben hacer cosas con esos datos
	 */

	public static void main(String[] args) {

		FizzBuzz.hacerFizzBuzz();

	}

}
