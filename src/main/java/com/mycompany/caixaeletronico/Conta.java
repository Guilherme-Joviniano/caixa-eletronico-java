package com.mycompany.caixaeletronico;

/**
 *
 * @author Guilherme Joviniano 
 */
public class Conta {

    private String agencia;
    private String conta;
    private double saldo;
    
    //Constructor
    
    public Conta(String agencia, String conta) {
        setAgencia(agencia);
        setConta(conta);
        setSaldo(10000);
    }

    //GETTER
    public String getAgencia() {
        return this.agencia;
    }
    public String getConta() {
        return this.conta;
    }
    public double getSaldo() {
        return this.saldo;
    }

    //SETTER
    private void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    private void setConta(String conta) {
        this.conta = conta;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos Funcionais da Classe Conta 
    public String verificarSaldo() {
       return String.format("R$: %.2f", getSaldo());
    }
    
    public void depositar(double valorDeposito) {
        setSaldo(valorDeposito + getSaldo());
    }
    
    public void sacar(double valorDeSaque) {
        if (validarOperacaoDeSaque(valorDeSaque)) {
            setSaldo(getSaldo() - valorDeSaque);
        }
    }
    
    private boolean validarOperacaoDeSaque(double valorDeSaque) {
        if (valorDeSaque < 0 || valorDeSaque > getSaldo()) {
            System.out.println("Operação Cancelada!, Saldo Indisponivel!");
            return false;
        }
        return true;
    }

}
