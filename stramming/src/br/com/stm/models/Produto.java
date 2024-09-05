import java.util.*;

public class Produto {
  private String nome;
  private float preco;
  private float percentualDesconto;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(float preco) {
    this.preco = Math.round(preco * 100) / 100;
  }

  public void setPercentualDesconto(float percentualDesconto) {
    if(percentualDesconto > 0) {
      this.percentualDesconto = (percentualDesconto / 100) * preco;        
  }else{
      this.percentualDesconto = 0;
  }
  }

  public String getNome() {
    return nome;
  }

  public float getPreco() {
    return preco;
  }

 public void discountApply() {
       preco -= percentualDesconto;
   
   System.out.printf("Valor total da compra: " + Math.floor(preco * 100) / 100);
  }
}