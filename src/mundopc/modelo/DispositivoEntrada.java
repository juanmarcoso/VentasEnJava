package mundopc.modelo;

public class DispositivoEntrada {

    private String tipoDeEntrada;
    private String marca;

    // Constructor
    public DispositivoEntrada(String tipoDeEntrada, String marca) {
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {

        return "Dispositivo de entrada {" +
                "tipo de entrada = " + '\'' + tipoDeEntrada + '\'' +
                ", marca = " + '\'' + marca + '\'' +
                '}';

    }

}
