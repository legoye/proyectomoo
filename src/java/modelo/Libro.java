package modelo;
class Libro implements Meta {
	String ISBN;
	String autor;
	String edicion;
	String editorial;

    @Override
    public String descripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}