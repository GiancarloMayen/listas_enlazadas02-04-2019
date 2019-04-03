package estructuralibros;



/**
 *
 * @autor Giancarlo
 */
public class Libro implements Comparable <Libro> {
    //variables de tipo private
    private int isbn;
    private String titulo;
    private String autor;
    
    
    //constructor de la clase libro
    public Libro (int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    //getter que  el da el titulo del libro
    public int getISBN () {
        return this.isbn;
    }
    //getter que da el nombre del autor del libro
    public String getAutor () {
        return this.autor;
    }
    //getter que da el titulo del libro
    public String getTitulo () {
        return this.titulo;
    }
    //setter que coloca el titulo del libro
    public void poner_Titulo_libro (String titulo) {
        this.titulo = titulo;
    }
    //setter que coloca el nombre del autor del libro
    public void poner_Autor_libro (String autor) {
        this.autor = autor;
    }
    
    @Override
    public int compareTo(Libro o) {//ecepxiones para que el programa corra
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}