package resources;

public interface VehiculoBuilder {
    void construirChasis();
    void construirMotor();
    void construirCojineria();
    Vehiculo obtenerVehiculo();
}
