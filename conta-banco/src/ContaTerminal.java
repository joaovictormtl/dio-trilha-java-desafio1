import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String agencia = args[0];
        int conta = Integer.valueOf(args[1]);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.next();

        System.out.print("Digite o saldo do cliente: ");
        double saldo = input.nextDouble();

        System.out.println("Olá ".concat(nomeCliente)+", obrigado por criar uma conta em nosso banco. Sua agência é ".concat(agencia)+", conta "+conta+" e seu saldo "+saldo+" já está disponível.");

        input.close();
    }
}
