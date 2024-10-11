package builder;

import resources.Chasis;
import resources.Cojineria;
import resources.Motor;
import resources.Vehiculo;
import resources.VehiculoBuilder;

public class ToyotaBuilder implements VehiculoBuilder {
    private Vehiculo vehiculo;

    public ToyotaBuilder() {
        this.vehiculo = new Vehiculo("Toyota", null, null, null, "Rojo", "2024-09-30", 12345);
    }

    @Override
    public void construirChasis() {
        Chasis chasis = new Chasis(4, "Automática");
        vehiculo = new Vehiculo(vehiculo.marca, chasis, vehiculo.motor, vehiculo.cojineria, vehiculo.color, vehiculo.fechaEnsamblaje, vehiculo.numeroEnsamblaje);
    }

    @Override
    public void construirMotor() {
        Motor motor = new Motor(200, "Híbrido");
        vehiculo = new Vehiculo(vehiculo.marca, vehiculo.chasis, motor, vehiculo.cojineria, vehiculo.color, vehiculo.fechaEnsamblaje, vehiculo.numeroEnsamblaje);
    }

    @Override
    public void construirCojineria() {
        Cojineria cojineria = new Cojineria("Cuero");
        vehiculo = new Vehiculo(vehiculo.marca, vehiculo.chasis, vehiculo.motor, cojineria, vehiculo.color, vehiculo.fechaEnsamblaje, vehiculo.numeroEnsamblaje);
    }

    @Override
    public Vehiculo obtenerVehiculo() {
        return this.vehiculo;
    }
}
