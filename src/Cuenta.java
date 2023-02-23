public class Cuenta {

    private double saldo;

    public Cuenta(double SaldoInicial){
        saldo = SaldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws SobreGiroException{
        saldo = saldo - cantidad;
    }

}
