import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Roberto Carlos";
        String tipoConta = "Conta Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*******************************");

        String menu = """
                **Digite sua Opção**
                1 - Consulta Saldo
                2 - Sacar
                3 - Depositar
                4 - Sair
               
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor que deseja sacar: ?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente: ");
                } else {
                   saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Qual valor deseja depositar ? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida: ");

                
            }


        }
    }
}
