package git.lipesc.algoritmotestdriven;

import java.util.HashMap;
import java.util.Map;

public class ConversorNumeroRomano {

  private static Map<Character, Integer> tabela = new HashMap<>() {
    {
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }
  };

  public int converte(String numeroEmRomano) {
    int count = 0;
    int lastRigth = 0;

    for (int i = numeroEmRomano.length() - 1; i >= 0; i--) {

      int current = tabela.get(numeroEmRomano.charAt(i));

      int multi = 1;

      if (current < lastRigth)
        multi = -1;

      count += tabela.get(numeroEmRomano.charAt(i)) * multi;

      lastRigth = current;
    }
    return count;
  }

}
