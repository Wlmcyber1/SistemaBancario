package banco;

import java.util.ArrayList;

public class Conta {
    private float saldoConta ;
    private String tipoConta;
    private int numConta;
    private boolean statusConta;
    private Cliente cliente;


    public Conta (Cliente cliente, String tipoConta){
        this.tipoConta = tipoConta;
        this.setCliente(cliente);

        this.setSaldoConta(0);
        this.setStatusConta(false);

    }
    public void abrirConta (String tipo){
        this.setTipoConta(tipo);
        this.setStatusConta(true);//utilizando o metodo identificador -> sempre dê preferencia a esse metodo
        if(tipo == "CC" || tipo == "cc"){
            this.setSaldoConta(50);
        }else if (tipo == "CP" || tipo == "cp"){
            this.setSaldoConta(150);
        }
        System.out.println("Conta aberta com sucesso");

    }

    public void fecharConta ( ){

         if (this.getSaldoConta()< 0) {
            System.out.println("Pague o seu debito para o cancelamento");
        } else if (this.getSaldoConta() > 0) {
            System.out.println("Retire o valor em conta");

        }else{
             System.out.println("Conta cancelada com sucesso");
         }
    }


    public void depositar(float v){
        if(this.isStatusConta()){ //pega o status da conta e ver se ta true. se for verdadeiro, o valor pode ser depositado
            this.saldoConta = this.saldoConta + v;
            System.out.println("Valor em conta: " + getSaldoConta());//mostra o valor atual após o deposito
        }
    }

    public void sacar ( float valor){
        if ( this.getSaldoConta() >=valor){
            this.saldoConta = this.saldoConta - valor;
            System.out.println("Valor em conta: " + getSaldoConta());
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

