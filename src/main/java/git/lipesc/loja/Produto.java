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

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
      return false;
    return true;
  }

}
