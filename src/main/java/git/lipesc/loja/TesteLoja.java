package git.lipesc.loja;

public class TesteLoja {

  public static void main(String[] args) {
    CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

    carrinho.adiciona(new Produto("Aspirador de pó", 200.0));
    carrinho.adiciona(new Produto("Panela pressão", 280.0));
    carrinho.adiciona(new Produto("Geladeira", 2880.0));

    FiltrarCarrinho algoritmo = new FiltrarCarrinho();
    algoritmo.encontrar(carrinho);

    System.out.printf("Maior preço do carrinho: %s%n", algoritmo.getMaior().getNome());
    System.out.printf("Menor preço do carrinho: %s%n", algoritmo.getMenor().getNome());
  }
}