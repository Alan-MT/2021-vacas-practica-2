package src.clientes;

/**
 * Cliente
 */
public class Cliente {
    private int id;
    private String nombre;
    private int telefono;
    private boolean tienePrestado;

    public Cliente(int id, String nombre, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente(int id, String nombre){
        this(id, nombre, 0);
    }

    //getters y setters

    public int getId(){
        return id;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTienePrestado() {
        return tienePrestado;
    }

    public void setTienePrestado(boolean tienePrestado) {
        this.tienePrestado = tienePrestado;
    }

    //fin getters y setters



    public String getInformacion(){
        String resultado = "Id: "+id+" Nombre del cliente: " + nombre+ "  telefono "+telefono+ " Estado de prestamo "+mostrarprestamo(tienePrestado);
        return resultado;
    }

    public String mostrarprestamo(boolean estAActivo){
if (estAActivo) {
    return "Activo";
} else {
    return "No Activo";
}
    }
    
}