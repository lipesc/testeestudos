package git.lipesc.loja;

public class Loja {
  public static void main(String[] args) {
    CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

    carrinho.adiciona(new Produto("Aspirador de pó", 200.0));
    carrinho.adiciona(new Produto("Geladeira", 2880.0));
    carrinho.adiciona(new Produto("Panela pressão", 280.0));

    TesteMaiorMenor algoritmo = new TesteMaiorMenor();
    algoritmo.encontrar(carrinho);

    System.out.printf("Carrinho:%nMaior produto é: %s%nMenor produto é: %s%n", 
        algoritmo.getMaior().getProduto(), algoritmo.getMenor().getProduto());
  }
}