package grf.dr.core;

import java.awt.Graphics;

public class Entidad {

	protected float tiempoTotal;
	public boolean activado = true;
	
	public Entidad(){
		MotorGrafico.agregarEntidad(this);
	}
	
	public void ejecutar(float step){
		tiempoTotal +=step;
		//presentar( lienzo.getGraphics() );
	}
	
	public void presentar(Graphics g){
	
	}
	
}
