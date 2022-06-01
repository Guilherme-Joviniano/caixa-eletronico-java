package com.mycompany.caixaeletronico;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Joviniano 
 */

public class CaixaEletronico {
    
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        contas.add(new Conta("ag-123", "1234-567"));
        byte opcao = 0;

        //      Menu de Acesso 
        while (opcao != 4) {
            System.out.println("Digite O Número: \n [1]Verificar Saldo \n [2]Deposito \n [3]Sacar \n [4]Sair");
            opcao = scan.nextByte();
            double valor = 0;

            switch (opcao) {
                case 1:
                    contas.get(0).verificarSaldo();
                    break;

                case 2:
                    System.out.println("Digite o valor de deposito");
                    valor = scan.nextDouble();
                    contas.get(0).depositar(valor);
                    contas.get(0).verificarSaldo();
                    break;
                    
                case 3:
                    System.out.println("Digite o valor de saque");
                    valor = scan.nextDouble();
                    contas.get(0).sacar(valor);
                    contas.get(0).verificarSaldo();
                    break;
                
                case 4:
                    System.out.println("Obrigado pela preferência!");
                    break;

                default:
                    System.out.println("Digite uma opção valida!");
            }
        }
    }
}
