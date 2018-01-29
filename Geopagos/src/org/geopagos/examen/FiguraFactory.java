package org.geopagos.examen;

import java.math.BigDecimal;

public class FiguraFactory {

	private static FiguraFactory instance;
	
	private FiguraFactory() {}
	
	public static synchronized FiguraFactory getInstance() {
		if (instance == null) {
			instance = new FiguraFactory();
		}
		return instance;
	}

	public FiguraGeometrica build(TipoFigura tipo) {
		
		FiguraGeometrica figura = null;
		
		switch (tipo) {
		case CIRCULO:
			
			figura = new Circulo(tipo, new BigDecimal(5));
			break;
			
		case CUADRADO:
			
			figura = new Cuadrado(tipo, new BigDecimal(7));
			break;
			
		case TRIANGULO:
			
			figura = new Triangulo(tipo, new BigDecimal(6), new BigDecimal(4));
			break;
		
		default:
			break;
		}
		
		return figura;
	}
	
}
