package git.lipesc.loja;

import org.junit.jupiter.api.Assertions;
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

    Assertions.assertEquals("Aspirador de pó", algoritmo.getMenor().getNome());
    Assertions.assertEquals("Geladeira", algoritmo.getMaior().getNome());
  }
}
