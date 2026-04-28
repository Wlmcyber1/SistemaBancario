# 🏦 Sistema Bancário em Java

Este projeto é um sistema bancário simples desenvolvido em **Java**, com foco em praticar conceitos de **Programação Orientada a Objetos (POO)**.

---

## 📌 Funcionalidades
- Criar uma nova conta (Corrente ou Poupança)
- Sacar valores
- Depositar valores
- Verificar saldo
- Encerrar conta

---

## 🛠️ Estrutura do Projeto
O projeto está organizado em três classes principais:

- **Cliente.java**  
  Representa o cliente do banco, com atributos como nome e CPF, além de uma lista de contas associadas.

- **Conta.java**  
  Representa a conta bancária. Possui atributos como saldo, tipo de conta, número e status.  
  Métodos principais: `abrirConta`, `fecharConta`, `depositar`, `sacar`, `getSaldoConta`.

- **SistemaBancario.java**  
  Classe principal com o método `main`. Contém o menu interativo para o usuário escolher operações.

---

## 🚀 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/Wlmcyber1/SistemaBancario.git
##Observação: Este código foi realizado para fins acadêmicos. Portanto, pode haver erros
