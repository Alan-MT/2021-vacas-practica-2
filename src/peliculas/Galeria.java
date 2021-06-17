package src.peliculas;

import src.tienda.*;

public class Galeria {
    
    private Pelicula[] peli = new Pelicula[50];
    private String[] categorias = {" Accion ","Animacion","Ciencia Ficcion", "comedio","Drama","Drama", "Romantica", "Terror"};
    private int contadorPeli;
    
    public Galeria(){
        contadorPeli = 1;
    }

    public void mostrarPeliculas(){
        System.out.println("\n\nPeliculas de memorabilia");
        for (int i = 0; i < (contadorPeli-1); i++) {
            System.out.println("-"+(i+1)+") "+peli[i].informacion());
            
        }
    }
        public void agregarPelicula(String nombre, String Categoria, int anio){
            if (contadorPeli > 50){
                System.out.println("Límite de las peliculas alcanzado");
            }
            else{
                peli[(contadorPeli-1)] = new Pelicula(nombre,Categoria,anio);
            }
            contadorPeli++;
        }
    
        public void agregarPelicula(){
            String nombrepeli = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
            String categoria = elegirCategoria();
            int anios = IngresoDatos.getEntero("Ingrese el anio de la pelicula", false);
            agregarPelicula(nombrepeli, categoria, anios);
        }

        public String elegirCategoria(){
            System.out.println("\nCategorias a elegir");
            for (int i = 0; i < categorias.length; i++) {
                System.out.println((i+1+ ") "+categorias[i]));
            }
            int cate = IngresoDatos.getEntero("ingrese el numero de la categoria", false);
            return categorias[cate-1];
        }
        public void ordenarPeliculaPorNombre(boolean ascendente){
            boolean cambio = true;
    
            for (int i = 1; i < (contadorPeli-1); i++) {
                for (int j = 0; j < (contadorPeli-1-i); j++) {
                    if (ascendente){
                        cambio= (peli[j].getNombre().compareTo(peli[j+1].getNombre()) > 0 );
                    }else {
                        cambio= (peli[j].getNombre().compareTo(peli[j+1].getNombre()) < 0 );
                    }if(cambio ){
                        Pelicula aux = peli[j];
                        peli[j] = peli[j+1];
                        peli[j+1]= aux;
                    }
                }
            }
    
        }
    }
