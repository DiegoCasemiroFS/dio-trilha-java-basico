import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

    Double saldo = 237.48;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ola, digite o numero da sua agencia: ");
    String agencia = scanner.nextLine();

    System.out.println("Digite o numero da sua conta: ");
    String numero = scanner.nextLine();

    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, ");
    System.out.print("sua agência é " + agencia);
    System.out.print(", a conta é " + numero);
    System.out.print(" e seu saldo de " + saldo + " já esta disponivel para saque.");

    }
    
}
