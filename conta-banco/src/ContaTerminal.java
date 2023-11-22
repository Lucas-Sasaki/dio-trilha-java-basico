import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       // Solicitar e receber os dados do usuário
       System.out.println("Por favor, digite o número da Agência: ");
       String agencia = scanner.nextLine();

       System.out.println("Por favor, digite o número da conta: ");
       int numero = Integer.parseInt(scanner.nextLine());

       System.out.println("Por favor, digite o nome do cliente: ");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor, digite o saldo: ");
       double saldo = scanner.nextDouble();

       //Exibir a mensagem com os dados inseridos pelo usuário
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
       System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
