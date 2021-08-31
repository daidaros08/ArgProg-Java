package CaballoTest;

import static org.junit.jupiter.api.Assertions.*;
import ponyExpress.PonyExpress;
import ponyExpress.Caballo;
import org.junit.jupiter.api.Test;

class CaballoTest {
	PonyExpress c1 = new PonyExpress(new Caballo(0));

	@Test
	void DistanciaTest() {
		assertEquals(1, c1.caballos(new int[] { 18, 15 }));
		assertEquals(2, c1.caballos(new int[] { 43, 23, 40, 13 }));
		assertEquals(3, c1.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 })); 
		assertEquals(3, c1.caballos(new int[] { 51, 51, 51 }));
		assertEquals(4, c1.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));;
	}

}
 