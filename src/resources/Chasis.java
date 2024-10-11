package resources;

public class Chasis {
    private int numeroEjes;
    private String tipoTransmision;

    public Chasis(int numeroEjes, String tipoTransmision) {
        this.numeroEjes = numeroEjes;
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public String toString() {
        return "Chasis [numeroEjes=" + numeroEjes + ", tipoTransmision=" + tipoTransmision + "]";
    }
}
