package git.lipesc.algoritmotestdriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConversorNumeroRomanoTest {

  @Test
  public void parseSimboloI() {

    ConversorNumeroRomano romano = new ConversorNumeroRomano();
    int numero = romano.converte("I");
    assertEquals(1, numero);

  }

  @Test
  void parseSimboloV() {
    ConversorNumeroRomano romano = new ConversorNumeroRomano();
    int numero = romano.converte("V");
    assertEquals(5, numero);
  }
}
