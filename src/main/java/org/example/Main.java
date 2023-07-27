package org.example;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Bem-vindo ao banco");
        System.out.println("\nColoque seu nome");
        contaBancaria.setNome(scanner.nextLine());
        System.out.println("\nSeja bem-vindo " + contaBancaria.getNome());

        int x = 0 ;

            do {

                contaBancaria.bonus();

                int opcao = 0;

                System.out.println("Escolha sua opção");
                System.out.println("\n1 - Resgate");
                System.out.println("\n2 - Depósito");
                System.out.println("\n3 - Dados da conta");
                System.out.println("\n4 - Investimento");
                opcao = (scanner.nextInt());


                switch (opcao){

                    case 1: {
                        contaBancaria.resgate();
                        System.out.println(contaBancaria.getSaldoInicial());
                        break;
                    }

                    case 2: {
                        contaBancaria.deposito();
                        System.out.println(contaBancaria.getSaldoInicial());
                        break;
                    }

                    case 3:{
                        contaBancaria.imprimir();
                        break;
                    }

                    case 4:{
                        contaBancaria.investir();
                        break;
                    }







                }




            }while(x != 5);
    }
}