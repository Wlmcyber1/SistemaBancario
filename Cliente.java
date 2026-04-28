package banco;

import java.util.ArrayList;

public class Cliente {
  private String nome;
  private String cpf;
  ArrayList <Conta> conta = new ArrayList<Conta>();
    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
  //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getConta() {
        return conta;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //fim metodos getters e setters



}




