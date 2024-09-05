import java.util.*;

public class ContaBancaria {
  private String numConta;
  private double saldo;
  public String titular;

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public void setSaldo(double saldo){
    this.saldo = Math.floor(saldo * 100) / 100;
  }

  public String getNumConta() {
    return numConta;
  }

  public double getSaldo() {
    return saldo;
  }

  void extratoConta() {
    System.out.println("-----------------");
    System.out.println("SALDO");
    System.out.println("-----------------");
    System.out.println("Titular da conta: " + titular);
    System.out.println("Número da conta: " + numConta);
    System.out.println("Saldo: " + saldo);
  }

}