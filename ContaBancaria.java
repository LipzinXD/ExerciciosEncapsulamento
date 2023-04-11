public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;

    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular=titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public double sacaValor(double Valor) {
        if (Valor <= this.saldo) {
            return this.saldo = this.saldo - Valor;
        } else {
            System.out.println("Saldo Insuficiente!!!");
            return this.saldo;
        }
    }

    public double depositarValor(double valor) {
        if (valor > 0) {
            return this.saldo = this.saldo + valor;
        } else {
            System.out.println("Não pode depositar valor negativo!");
            return this.saldo;
        }
    }

    public void consultaValor(){
        getSaldo();

    }
}
