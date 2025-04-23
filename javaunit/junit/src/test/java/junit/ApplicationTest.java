
package junit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Application")
public class ApplicationTest {

  @Test
  @DisplayName("Pointless test") // Anotaciones 
  void smokeTest() {
    assertThat(true).isEqualTo(true);
  }
}

// JUnit no necesita main 
// Va ejecutando todas las anotaciones que tengan la anotacion @Test