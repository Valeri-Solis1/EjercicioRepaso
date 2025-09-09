public class Velocista extends Ciclista{
    private double pontenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int identificador, String nombre, double pontenciaPromedio, double velocidadPromedioSprint){
        super(identificador, nombre);
        this.pontenciaPromedio = pontenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;

    }

    public double getPotenciaPromedio(){
        return this.pontenciaPromedio;
    }
    public void setPotenciaPromedio(double pontenciaPromedio){
        this.pontenciaPromedio = pontenciaPromedio;

    }
    public double getVelocidadPromedioSprint(){
        return this.velocidadPromedioSprint;
    }
    public void setVelocidadPromedioSprint(double velocidadPromedioSprint){
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }


    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Potencial Promedio: " + pontenciaPromedio + "W");
        System.out.println("Velocidad promedio sprint: " + velocidadPromedioSprint + "Km/h");
    }
}
