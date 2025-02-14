package git.lipesc.lojaTesteUnitario;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

  private List<Produto> produtos = new ArrayList<>();

  public void adiciona(Produto produto) {
    produtos.add(produto);
  }

  public List<Produto> getProdutos() {
    return produtos;
  }
}