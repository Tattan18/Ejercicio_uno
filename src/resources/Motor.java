package resources;

public class Motor {
    private int potenciaMaxima;
    private String tecnologia;

    public Motor(int potenciaMaxima, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Motor [potenciaMaxima=" + potenciaMaxima + ", tecnologia=" + tecnologia + "]";
    }
}
