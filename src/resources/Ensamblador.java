package resources;

public class Ensamblador {
    private VehiculoBuilder builder;

    public Ensamblador(VehiculoBuilder builder) {
        this.builder = builder;
    }

    public Vehiculo ensamblarVehiculo() {
        builder.construirChasis();
        builder.construirMotor();
        builder.construirCojineria();
        return builder.obtenerVehiculo();
    }
}
