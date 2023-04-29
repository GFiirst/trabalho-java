
public class Fornecedor extends Pessoa {
    private double credito;
    private double divida;
    private double saldo;

    public Fornecedor(String nome) {
        super(nome);
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public double getDivida() {
        return divida;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = this.credito - this.divida;
    }
}

