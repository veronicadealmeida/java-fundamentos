import java.text.MessageFormat;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        String nomeDoCliente = "Jacqueline Oliveira";
        String tipoDaConta = "Corrente";
        int opcao = 0;
        double saldo = 2500.00;
        double valorDaTransferencia = 0;
        Scanner leitura = new Scanner(System.in);
        String mensagemDeSaidaParaUsuario = MessageFormat.format("""
                ***********************
                Dados iniciais do cliente: {0}
                Tipo conta:  {1}
                Saldo inicial: R$ {2}
                ***********************
                """,nomeDoCliente,tipoDaConta,saldo );
        String menu = """
                *** Operações ***
                                
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                
                Digite a opção desejada: """;

        System.out.println(mensagemDeSaidaParaUsuario);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    ConsultaSaldo(saldo);
                    break;
                case 2:
                    saldo = RecebeValor(saldo);
                    break;
                case 3:
                    saldo = TrasnfereValor(saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("""
                            Opção inválida!
                            """);
            }
        }
    }

    static void ConsultaSaldo(double saldoBancario) {
        System.out.println("""
                
                ***** Saldo: """ + saldoBancario +
                """

                """);
    }

    static double RecebeValor(double saldoBancario) {
        double valorAdicionado = 0.0;
        System.out.println("***** Informe o valor: ");
        Scanner leitura = new Scanner(System.in);
        valorAdicionado = leitura.nextDouble();

        saldoBancario += (double) valorAdicionado;
        ConsultaSaldo( saldoBancario);
        return saldoBancario;
    }

    static double TrasnfereValor(double saldoBancario) {
        double valorTransferido = 0.0;
        System.out.println("***** Informe o valor: ");
        Scanner leitura = new Scanner(System.in);
        valorTransferido = leitura.nextDouble();

        if( valorTransferido > saldoBancario) {
            System.out.println("***** Valor maior que o saldo bancário não pode ser transferido!");
        } else {
            saldoBancario -= (double) valorTransferido;
            ConsultaSaldo(saldoBancario);
        }
        return saldoBancario;
    }
}




