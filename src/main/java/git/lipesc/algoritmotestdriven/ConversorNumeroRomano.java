package git.lipesc.algoritmotestdriven;

import java.util.HashMap;
import java.util.Map;

public class ConversorNumeroRomano {

  private static Map<String, Integer> tabela = new HashMap<>() {
    {
      put("I", 1);
      put("V", 5);
      put("X", 10);
      put("L", 50);
      put("C", 100);
      put("D", 500);
      put("M", 1000);
    }
  };

  public int converte(String numeroEmRomano) {
    return tabela.get(numeroEmRomano);
  }

}
