import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldo;


        System.out.println("Bom dia!");
        System.out.println( );

        System.out.println("digite seu nome, por favor:");
        nomeDoCliente =sc.nextLine();   

        System.out.println( );
         System.out.println("Digite o número de sua agência, por favor:");
         agencia =sc.nextLine();

         System.out.println();

         System.out.println("Digite  o numero de sua conta, por favor:");
         numeroDaConta = sc.nextInt();

         System.out.println( );

         System.out.println("E por fim, digite o seu saldo atual: ");
         saldo =sc.nextDouble();

         System.out.println();

         System.out.println("Olá, "+ nomeDoCliente+"! Obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+", sua conta é a "+numeroDaConta+" e seu saldo de "+saldo+" reais já está disponível par saque!");











    }
}
