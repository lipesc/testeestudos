package git.lipesc.loja;

public class TesteMaiorMenor {

  private Produto menor;
  private Produto maior;

  public void encontrar(CarrinhoDeCompra carrinho) {
    for (Produto produto : carrinho.getProduto()) {
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
