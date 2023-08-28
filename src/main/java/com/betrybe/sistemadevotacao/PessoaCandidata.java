package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Construtor.
   */
  public PessoaCandidata(String name, int number) {
    super.nome = name;
    this.numero = number;
    this.votos = 0;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String newName) {
    nome = newName;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int newNumber) {
    numero = newNumber;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int newValue) {
    votos = newValue;
  }

  public void receberVoto() {
    votos += 1;
  }

}
