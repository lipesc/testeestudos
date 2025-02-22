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

  @Test
  void parseDoisSimbolos() {
    ConversorNumeroRomano romano = new ConversorNumeroRomano();
    int numero = romano.converte("II");
    assertEquals(2, numero);
  }

  @Test
  void parseQuatroSImbolos() {
    ConversorNumeroRomano romano = new ConversorNumeroRomano();
    int numero = romano.converte("XXII");
    assertEquals(22, numero);
  }

  @Test
  void parseSimboloEsquerda() {
    ConversorNumeroRomano romano = new ConversorNumeroRomano();
    int numero = romano.converte("IX");
    assertEquals(9, numero);
  }
}
