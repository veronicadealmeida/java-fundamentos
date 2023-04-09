import java.util.Scanner;

public class DesafioContaBancariaSolucao {
    public static void main(String[] args) {
        String nome = "Maria da Silva";
        String tipoConta = "Corrente";
        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transgerir Valor
                3 - Receber Valor
                4 - Sair
                
                """;
        double saldo = 2500.00;
        int opcao = 0;


        Scanner leitura = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("Saldo atual R$: " + saldo);
        System.out.println("\n***************************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo +  "\n");
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor >  saldo) {
                    System.out.println("Não há saldo para realizar a transferência!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo + "\n");
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo + "\n");

            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
                
            }

        }
    }
}
