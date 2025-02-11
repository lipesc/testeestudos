package git.lipesc.loja;

public class TesteMaiorMenor {

  private Produto menor;
  private Produto maior;

  // simulando um algoritmo para encontrar o menor e maior produto dentro de um
  // carrinho
  public void encontrar(CarrinhoDeCompra carrinho) {
    for (Produto produto : carrinho.getProdutos()) {
      if (menor == null || produto.getValor() < menor.getValor()) {
        menor = produto;
      } else if (maior == null || produto.getValor() > maior.getValor()) {
        maior = produto;
      }
    }
  }

  public Produto getMenor() {
    return menor;
  }

  public Produto getMaior() {
    return maior;
  }
}