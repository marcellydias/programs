package aulapoo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AulaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Conta c = new Conta();
        System.out.println("Inicializando conta...");
        c.inicializarConta(202020);
        c.exibirDados();

        System.out.println("Depositando 1000,00...");
        c.depositar(1000);
        c.exibirDados();

        System.out.println("Sacando 300,00...");
        c.sacar(300);
        c.exibirDados();
    }
   */
       /* Conta c = new Conta();
        System.out.println("Inicializando conta1...");
        c.inicializarConta(202020);
        c.exibirDados();

        Conta c2 = new Conta();
        System.out.println("Inicializando conta2...");
        c2.inicializarConta(101010);
        c2.exibirDados();

        System.out.println("Depositando 1000,00 na conta 2...");
        c2.depositar(1000);
        c2.exibirDados();

        System.out.println("Saldo da conta 1...");
        c.exibirDados();
    */
   Conta c = new Conta();
        c.inicializarConta(151515);
        
        Scanner input = new Scanner(System.in);
        int opcao;
        double valor;

        do{
            System.out.println("1: DEPOSITAR");
            System.out.println("2: SACAR");
            System.out.println("3: MOSTRAR");
            System.out.println("4: SAIR");

            opcao = input.nextInt();
switch (opcao){
                case 1: 
                    System.out.print("Digite o valor para depósito: ");
                    valor = input.nextDouble();
                    c.depositar(valor);
                    break;
                case 2: 
                    System.out.print("Digite o valor para saque: ");
                    valor = input.nextDouble();
                    c.sacar(valor);
                    break;
                case 3: 
                    c.exibirDados();
                    break;
                case 4: 
                    System.out.println("FIM DO PROGRAMA!!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (opcao != 4);     
}
}
