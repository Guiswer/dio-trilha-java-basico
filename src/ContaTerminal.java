import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in).useLocale(Locale.US); //Criação da instância de Scanner

        // Solicitando número da Agência
        System.out.println("Por favor, digite o número da Agência: ");
        int numero = s.nextInt();
        s.nextLine();

        // Solicitando nome da Agência
        System.out.println("Por favor, digite o nome de sua Agência: ");
        String agencia = s.nextLine();

        // Solicitando nome do user
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = s.nextLine();

        // Solicitando o saldo da conta
        System.out.println("Por favor, digite o valor de seu saldo: ");
        double saldo = s.nextDouble();

        s.close(); // Encerrando a instância de Scanner

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu " +
                          "saldo %f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        System.out.println(); // Pulando uma linha
    }
}