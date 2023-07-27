package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaBancaria {

    private String nome;
    private float saldoInicial = 100;

    private float investido = 0;



    public void resgate(){

         float valorSacar = 0;

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Insira o valor que deseja sacar");
        valorSacar = (scanner.nextFloat());

        if(valorSacar > saldoInicial){
            System.out.println("Você não tem esse dinheiro");

        } else {

            System.out.println("Valor sacado com sucesso");
            saldoInicial -= valorSacar;
        }

    }

    public void deposito(){

        float valorDeposito =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor que deseja depositar");
        valorDeposito = (scanner.nextFloat());
        saldoInicial += valorDeposito;

    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(saldoInicial);
        System.out.println(investido);
    }

    public void investir(){

        float valorDepositado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor para investir (Com base no seu saldo)");
        valorDepositado = (scanner.nextFloat());

        if(valorDepositado > saldoInicial){
            System.out.println("Valor mais alto do que o você tem na conta");

        } else {
            saldoInicial -= valorDepositado;


            investido += valorDepositado;
            System.out.println("Valor total investido: " + investido);
        }


    }

    public void bonus(){

        float valor = (float) (investido * 0.05);

        investido = investido + valor;

    }


    public ContaBancaria() {
        this.nome = nome;
        this.saldoInicial = saldoInicial;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getInvestido() {
        return investido;
    }

    public void setInvestido(float investido) {
        this.investido = investido;
    }
}


