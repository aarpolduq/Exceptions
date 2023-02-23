public class SobreGiroException extends Exception{

    private double deficit;

    public SobreGiroException(String message){
        super(message);
    }
    public SobreGiroException(String message, double deficit){
        super(message);
    }

    public double getDeficit() {
        return deficit;
    }
}
