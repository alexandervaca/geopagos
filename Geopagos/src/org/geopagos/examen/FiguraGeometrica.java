package org.geopagos.examen;

import java.math.BigDecimal;

public interface FiguraGeometrica {

	public BigDecimal getSuperficie();
	
	public BigDecimal getBase();
	
	public BigDecimal getAltura();
	
	public BigDecimal getDiametro();
	
	public TipoFigura getTipo();
	
}
