package src.peliculas;

public class Pelicula {
    
    private String nombre, categoria;
    private int id, anio;
    private boolean dispnible;
    


    public Pelicula(String nombre, String categoria, int anio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.id = generarID();
        this.anio = anio;
        this.dispnible = true;;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDispnible() {
        return dispnible;
    }

    public void setDispnible(boolean dispnible) {
        this.dispnible = dispnible;
    }

    public String informacion(){
        return "ID: "+id+ ",  Nombre: "+nombre+",  Categoria: "+categoria+" , Anio:  "+anio +", Estado:  "+dispnibilidad(dispnible);
    }
    
    public  String dispnibilidad(boolean dispnibilidad){
        String mensaje;
        if (dispnibilidad) {
            mensaje = "Disponible";
        } else {
            mensaje = "Prestada";
        }
        return mensaje;
    }

    public int generarID(){
        int id = (int)(Math.random()*(1000-100)+100);
        return id;
    }

    

}
