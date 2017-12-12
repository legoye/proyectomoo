package modelo;

import java.util.Date;

abstract class Proyecto {
	String nombre;
	Usuario lider;
	Investigador [] participantes;
	double monto;
	Date fechaInicio;
	Date fechaFin;
	String objetivoGeneral;
	String objetivoEspecifico;
	Criterio[] calificacion;
	Evaluador[] evaluadores;
}