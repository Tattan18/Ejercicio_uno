package builder;

import resources.Chasis;
import resources.Cojineria;
import resources.Motor;
import resources.Vehiculo;
import resources.VehiculoBuilder;

public class FordBuilder implements VehiculoBuilder {
    private Vehiculo vehiculo;

    public FordBuilder() {
        this.vehiculo = new Vehiculo("Ford", null, null, null, "Azul", "2024-09-30", 67890);
    }

    @Override
    public void construirChasis() {
        Chasis chasis = new Chasis(4, "Mecánica");
        vehiculo = new Vehiculo(vehiculo.marca, chasis, vehiculo.motor, vehiculo.cojineria, vehiculo.color, vehiculo.fechaEnsamblaje, vehiculo.numeroEnsamblaje);
    }

    @Override
    public void construirMotor() {
        Motor motor = new Motor(300, "Térmico");
        vehiculo = new Vehiculo(vehiculo.marca, vehiculo.chasis, motor, vehiculo.cojineria, vehiculo.color, vehiculo.fechaEnsamblaje, vehiculo.numeroEnsamblaje);
    }

    @Override
    public void construirCojineria() {
        Cojineria cojineria = new Cojineria("Tela");
        vehiculo = new Vehiculo(vehiculo.marca, vehiculo.chasis, vehiculo.motor, cojineria, vehiculo.color, vehiculo.fechaEnsamblaje, vehiculo.numeroEnsamblaje);
    }

    @Override
    public Vehiculo obtenerVehiculo() {
        return this.vehiculo;
    }
}
