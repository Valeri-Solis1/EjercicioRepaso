public class Main {
    public static void main(String[] args) throws Exception {
    // 1. Crear un equipo
        Equipo equipo = new Equipo("Movistar Team", "España");

        // 2. Crear y agregar ciclistas de diferentes tipos
        Velocista velocista1 = new Velocista(101, "Fernando Gaviria", 400.0, 75.0);
        velocista1.setTiempoAcumulado(180);

        Escalador escalador1 = new Escalador(202, "Nairo Quintana", 25.0f, 10.0f);
        escalador1.setTiempoAcumulado(320);
        
        Contrarrelojista cr1 = new Contrarrelojista(303, "Filippo Ganna", 55.0);
        cr1.setTiempoAcumulado(150);
        
        equipo.añadirCiclista(velocista1);
        equipo.añadirCiclista(escalador1);
        equipo.añadirCiclista(cr1);

        // 3. Probar los métodos del equipo
        equipo.imprimirDatosEquipo(); // Imprime datos iniciales (tiempo 0)
        
        equipo.calcularTotalTiempos(); // Calcula la suma de tiempos
        
        System.out.println("\n*** Después de calcular el tiempo total ***");
        equipo.imprimirDatosEquipo(); // Muestra el tiempo total calculado
        
        equipo.listarNombresCiclistas(); // Muestra la lista de nombres

        // 4. Buscar e imprimir datos de un ciclista (uno que existe y uno que no)
        equipo.imprimirDatosCiclista(202); // Buscar a Nairo Quintana
        equipo.imprimirDatosCiclista(999); // Buscar un ciclista que no existe
        
        // 5. Demostración del método imprimirTipo() de un ciclista
        System.out.println("\n--- Tipo de Ciclista ---");
        System.out.println(velocista1.getNombre() + ": " + velocista1.imprimirTipo());
    }
    
}
