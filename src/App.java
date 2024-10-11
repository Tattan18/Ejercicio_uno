import builder.FordBuilder;
import builder.MazdaBuilder;
import builder.ToyotaBuilder;
import resources.Ensamblador;
import resources.Vehiculo;
import resources.VehiculoBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        // Ensamblaje de un vehículo Toyota
        VehiculoBuilder toyotaBuilder = new ToyotaBuilder();
        Ensamblador ensambladorToyota = new Ensamblador(toyotaBuilder);
        Vehiculo vehiculoToyota = ensambladorToyota.ensamblarVehiculo();
        System.out.println("Vehículo Toyota ensamblado:");
        System.out.println(vehiculoToyota);
        
        // Ensamblaje de un vehículo Ford
        VehiculoBuilder fordBuilder = new FordBuilder();
        Ensamblador ensambladorFord = new Ensamblador(fordBuilder);
        Vehiculo vehiculoFord = ensambladorFord.ensamblarVehiculo();
        System.out.println("\nVehículo Ford ensamblado:");
        System.out.println(vehiculoFord);
        
        // Ensamblaje de un vehículo Mazda
        VehiculoBuilder mazdaBuilder = new MazdaBuilder();
        Ensamblador ensambladorMazda = new Ensamblador(mazdaBuilder);
        Vehiculo vehiculoMazda = ensambladorMazda.ensamblarVehiculo();
        System.out.println("\nVehículo Mazda ensamblado:");
        System.out.println(vehiculoMazda);
    }
}
