package entities;

/**
 * Classe com informações de uma Conta Bancária.
 */
public class ContaBancaria {

    /**
     * Número da Conta Bancária.
     */
    private int numeroConta;

    /**
     * Agência da Conta Bancária.
     */
    private String agenciaConta;

    /**
     * Saldo disponível na Conta Bancária.
     */
    private double saldoConta;

    /**
     * {@link Pessoa} titular da Conta Bancária.
     */
    private Pessoa pessoaTitularConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Pessoa getPessoaTitularConta() {
        return pessoaTitularConta;
    }

    public void setPessoaTitularConta(Pessoa pessoaTitularConta) {
        this.pessoaTitularConta = pessoaTitularConta;
    }
}
