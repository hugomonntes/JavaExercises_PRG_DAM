
package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Application")
public class ApplicationTest {

  // @Test
  // @DisplayName("Pointless test") // Anotaciones
  // void smokeTest() {
  // assertThat(true).isEqualTo(true);
  // }

  @Test
  public void testFactorial() {
    assertEquals(120, Operaciones.factorial(5));
    assertEquals(1, Operaciones.factorial(1));
    assertEquals(1, Operaciones.factorial(0));
    assertEquals(6227020800L, Operaciones.factorial(13));
  }

  @Test
  public void testPrimo() {
    int[] primos = { 2, 3, 5, 7, 11, 13, 17, 19,
        23, 29, 31, 37, 41, 43, 47, 53, 59,
        61, 67, 71, 73, 79, 83, 89, 97 };
    int[] noPrimos = { 4, 6, 8, 9, 10, 12, 14,
        15, 16, 18, 20, 21, 22, 24, 25, 26,
        27, 28, 30 };
    for (int numero : primos) {
      assertTrue(Operaciones.primo(numero), "Falla el " + numero);
    }
    for (int numero : noPrimos) {
      assertFalse(Operaciones.primo(numero), "Falla el " + numero);
    }
    assertFalse(Operaciones.primo(0));
    assertFalse(Operaciones.primo(-10)); // Conveniente probar más negativos
    assertTrue(Operaciones.primo(-7));
  }
}

// JUnit no necesita main
// Va ejecutando todas las anotaciones que tengan la anotacion @Test