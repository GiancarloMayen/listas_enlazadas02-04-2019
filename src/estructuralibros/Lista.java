package estructuralibros;
//aqui declaramos las librerias que necesita la lista enlazada
import estructuralibros.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @autor Giancarlo
 */
public class Lista {

    public static void main(String[] args) {
        //variable tipo scaner para leer los datos
        Scanner leer = new Scanner(System.in);
        //usamos la clase array list para crear las listas
        ArrayList <Libro> libros = new ArrayList <>();
        
        
        String [] menu = {"1. Ingrese libro", "2. Eliminar libro (busqueda por ISBN)", "3. Mostrar la lista por ISBN", "4. Salir"};
        int respuesta = 0;
        //parametros para ingresar en la lista
        int isbn;
        String autor;
        String titulo;
        int contadorComprobante = 0;
        
        //While del menu
        while (respuesta != 4) {
            
            //Imprimimos menu
            for ( int contador = 0; contador < menu.length; contador++ ) {
                System.out.print("\n"+menu[contador]);
            }
            
            System.out.print("\n\tingrese una opcion   ");
            respuesta = leer.nextInt();
            
            switch (respuesta) {
                //caso 1 da la opcion de ingresar un nuevo libro
                case 1:
                    System.out.print("\nISBN:  ");
                    isbn = leer.nextInt();
                    leer.nextLine();
                    System.out.print("\nTítulo:  ");
                    titulo = leer.nextLine();
                    System.out.print("\nAutor:  ");
                    autor = leer.nextLine();
                    libros.add(new Libro(isbn, titulo, autor));
                    
                    break;
                   //caso 2 nos da la opcion a eliminar un libro 
                case 2:
                    System.out.print("\nIntroduce codigo ISBN a eliminar: ");
                    isbn = leer.nextInt();
                    //si el contador = 1;
                    for ( int contador = 0; contador < libros.size(); contador++ ) {
                        //si el isbn es igual al de algun libro ya ingresado
                        if (isbn == libros.get(contador).getISBN()) {
                            //lo removemos de la lista
                            libros.remove(contador);
                            System.out.print("\nLibro borrado.\n");
                            //regresamos la variable a 0
                            contadorComprobante = 0;
                        }else {
                             System.out.print("\nNo se encuentra el código ISBN en la base de datos.\n"); 
                             contadorComprobante++;
                        }
                    }
                    break;
                //caso 3 nos da la opcion de buscar un isbn
                case 3:
                    leer.nextLine();
                    System.out.print("\nBuscar ISBN: ");
                    isbn = leer.nextInt();
                    
                    for ( int contador = 0; contador < libros.size(); contador++ ) {
                        if ( isbn == libros.get(contador).getISBN() ) {
                            System.out.print("\n"+"Autor: "+libros.get(contador).getAutor()+",  "+"Titulo: "+libros.get(contador).getTitulo()+",  "+"ISBN: "+libros.get(contador).getISBN()+"\n");
                        }
                    }
                    break; 
                //caso 4 se sale del programa, y manda un mensaje en pantalla
                case 4:
                    System.err.print("adios");
                    System.exit(0);
                    break;
                    //default solo muestra un mensaje en pantalla y se sale del programa
                default:System.out.println("opcion invalida ingresa alguna opcion valida,adios");
                System.exit(0);
                break;
            }
                    
        }
    }
}