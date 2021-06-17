package src.peliculas;

import src.clientes.*;
import src.tienda.IngresoDatos;

public class Prestamo {

    public Prestamo(){
        int S = 0;
    }

    public void peliculapresta(VectorClientes tablaClientes, Galeria tablapeliculas) {

        tablaClientes.mostrarClientes();
        int elecion = IngresoDatos.getEntero("Eliga a la persona ", false);
        tablapeliculas.mostrasDisponibles();

    }
    

    
}
