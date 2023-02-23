public class CuentaCorriente extends Cuenta{

    private double cantidadSobreGiro;

    public CuentaCorriente(double saldoInicial, double sobreGiro){
        super(saldoInicial);
        cantidadSobreGiro = sobreGiro;

    }
    public CuentaCorriente(double saldoInicial){
        super(saldoInicial);
    }

    public void retirar(double cantidad) throws SobreGiroException{
        double saldo = getSaldo() - cantidad;

        if(saldo < cantidadSobreGiro){
            double deficit = cantidadSobreGiro - saldo;
            throw new SobreGiroException("Deficit de: "+deficit);
        }

        setSaldo(saldo);
        System.out.println("Saldo restante: "+saldo);
    }


}
