public class OperaciónMatematica<T extends Number> {

    //Atributos
    private T nro1;
    private T nro2;

    //Método constructor
    public OperaciónMatematica() {}

    //Otros métodos
    public void establecerNumeros(T nro1, T nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public T sumar() {

        return (T) Double.valueOf(this.nro1.doubleValue() + this.nro2.doubleValue());
    }

    public T restar() {

        return (T) Double.valueOf(this.nro1.doubleValue() - this.nro2.doubleValue());
    }

    public T dividir() {
        return (T) Double.valueOf(this.nro1.doubleValue() / this.nro2.doubleValue());
    }

    public T multiplicar() {
        return (T) Double.valueOf(this.nro1.doubleValue() * this.nro2.doubleValue());
    }
}
