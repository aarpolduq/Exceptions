public class Test {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(200, -500);
        cc.depositar(25.50);
        try {
            cc.retirar(148.25);
            cc.retirar(470);
            cc.retirar(300);
        } catch (SobreGiroException e) {
            throw new RuntimeException(e);
        }

    }



}