package modelo;
class Investigador extends Usuario implements Participante {
	String nombre;
	String institucion;
	String nivel;
	String tipo;
	void consultarProyectoAdscrito(){

	}

    @Override
    public Investigador[] obtenerParticipantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}