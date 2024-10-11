package resources;

public class Vehiculo {
    public String marca;
    public Chasis chasis;
    public Motor motor;
    public Cojineria cojineria;
    public String color;
    public String fechaEnsamblaje;
    public int numeroEnsamblaje;

    public Vehiculo(String marca, Chasis chasis, Motor motor, Cojineria cojineria, String color, String fechaEnsamblaje, int numeroEnsamblaje) {
        this.marca = marca;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", chasis=" + chasis + ", motor=" + motor + ", cojineria=" + cojineria +
                ", color=" + color + ", fechaEnsamblaje=" + fechaEnsamblaje + ", numeroEnsamblaje=" + numeroEnsamblaje + "]";
    }
}
