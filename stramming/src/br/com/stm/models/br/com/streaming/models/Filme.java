package br.com.streaming.models;

public class Filme {
  private String nome;
  private int anoLancamento;
  private boolean incluidoPlano;
  private double somaAvaliacoes;
  private int totalAvaliacoes;
  private int duracaoMinutos;



  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  public void setIncluidoPlano(boolean incluidoPlano) {
    this.incluidoPlano = incluidoPlano;
  }

  public void setDuracaoMinutos(int duracaoMinutos) {
    this.duracaoMinutos = duracaoMinutos;
  }

  public String getNome() {
    return nome;
  }

  public int getAnoLancamento() {
    return anoLancamento;
  }

  public int getduracaoMinutos() {
    return duracaoMinutos;
  }

  public int getTotalAvaliacoes() {
    return totalAvaliacoes;
  }

  public void exibeFichaTecnica() {
    System.out.println("Neme do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoLancamento);
    System.out.println("Duração: " + duracaoMinutos + " minutos");
  }

  public void receiveAvaliar(double avaliacoes) {
    somaAvaliacoes += avaliacoes;
    totalAvaliacoes++;
  }

  public double mediaAvaliacoes(){
    return somaAvaliacoes / totalAvaliacoes;
  }
}