public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
        
    }

    public double getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;

    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarelojista";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Velocidad Maxima: " + velocidadMaxima + "Km/h");
    }
}
