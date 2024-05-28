import entities.ContaBancaria;
import entities.Pessoa;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /**
         * {@code Scanner} para ler informações do terminal.
         */
        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setPessoaTitularConta(new Pessoa());

        System.out.println("Por favor, digite o número da Agência:");
        contaBancaria.setAgenciaConta(scanner.next());

        System.out.println("Por favor, digite o número da Conta:");
        contaBancaria.setNumeroConta(scanner.nextInt());

        System.out.println("Por favor, digite o nome do titular:");
        contaBancaria.getPessoaTitularConta().setNome(scanner.next());

        System.out.println("Por favor, informe o saldo de abertura da conta:");
        contaBancaria.setSaldoConta(scanner.nextDouble());

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %s e seu saldo R$ %s já está disponível para saque.",
                contaBancaria.getPessoaTitularConta().getNome(),
                contaBancaria.getAgenciaConta(),
                contaBancaria.getNumeroConta(),
                contaBancaria.getSaldoConta()));
    }
}