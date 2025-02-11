package git.lipesc.loja;

public class Produto {

  private String nome;
  private double valor;

  public Produto(String produto, double valor) {
    this.nome = produto;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String produto) {
    this.nome = produto;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

}
