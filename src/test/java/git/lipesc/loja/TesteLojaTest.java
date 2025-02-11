package git.lipesc.loja;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class TesteLojaTest {
  @Test
  void testMain() {
    CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

    carrinho.adiciona(new Produto("Geladeira", 2880.0));
    carrinho.adiciona(new Produto("Panela pressão", 280.0));
    carrinho.adiciona(new Produto("Aspirador de pó", 200.0));
    FiltrarCarrinho algoritmo = new FiltrarCarrinho();
    algoritmo.encontrar(carrinho);

    assertEquals("Aspirador de pó", algoritmo.getMenor().getNome());
    assertEquals("Geladeira", algoritmo.getMaior().getNome());

  }

  @Test
  void equals() {
    Produto produto1 = new Produto("tv", 10000.0);
    Produto produto2 = new Produto("tv", 10000.0);
    Produto produto3 = new Produto("pc", 13.0);

    assertEquals(produto1, produto2, "produtos mesmo nome, valor são iguais");
    assertNotEquals(produto1, produto3, "produtos com nomes diferentes nao sao iguais");

  }

  @Test
  void testGettersAndSetters() {
    Produto produto1 = new Produto("tv", 10000.0);

    assertEquals("tv", produto1.getNome());
    assertEquals(10000.0, produto1.getValor());

    produto1.setNome("tv x");
    produto1.setValor(666.666);

    assertEquals("tv x", produto1.getNome());
    assertEquals(666.666, produto1.getValor());

  }
}
