public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }
    public float getAceleracionPromedio(){
        return this.aceleracionPromedio;
    }
    public void setAceleracionPromedio(float aceleracionPromedio){
        this.aceleracionPromedio = aceleracionPromedio;
    }
    public float getGradoRampa(){
        return this.gradoRampa; 
    }
    public void setGradoRampa(float gradoRampa){
        this.gradoRampa = gradoRampa;
    }


    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Aceleracion Promedioen subida: " + aceleracionPromedio + "m/s2");
        System.out.println("Grado de rampa soportada: " + gradoRampa + "%");
    }
    
}
