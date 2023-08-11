import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(System.in);
        // Scanner scaner = new Scanner(System.in).useLocale(Locate.US);

        /*
         * System.out.println("Digite o número da Conta!");
         * int numero = sc1.nextInt();
         * 
         * System.out.println("digite o número da Agência!");
         * String agencia = sc1.next();
         * 
         * System.out.println("digite o Nome do Cliente!");
         * String nomeCliente = sc1.next();
         * 
         * System.out.println("digite o Saldo da Conta !");
         * double saldo = sc1.nextDouble();
         * 
         * System.out.println(
         * "Olá " + nomeCliente
         * + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
         * ", conta "
         * + numero + " e seu saldo " + saldo + " já está disponível para saque.");
         * 
         */
        System.out.println("digite a nota !");
        int nota = sc1.nextInt();

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.err.println(resultado);

    }
}
