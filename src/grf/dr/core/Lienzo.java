package grf.dr.core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Lienzo extends JPanel{

	static ArrayList<Entidad> entidades;
	
	public Lienzo(){
		entidades = new ArrayList<Entidad>();
	}
	
	protected void agregarEntidad(Entidad e){
		entidades.add(e);
	}
	
	@Override
	public void paint(Graphics g) {		
		setDoubleBuffered(true);

		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
			    RenderingHints.VALUE_ANTIALIAS_ON);
		
		for( int i = 0 ; i < entidades.size();i ++)
			entidades.get(i).presentar(g);
	}
	
}
