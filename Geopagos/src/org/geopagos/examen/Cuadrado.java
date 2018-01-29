package org.geopagos.examen;

import java.math.BigDecimal;

public class Cuadrado extends FiguraAbstract {

	private BigDecimal lado;
	
	public Cuadrado(TipoFigura tipo, BigDecimal lado) {
		super(tipo);
		this.lado = lado;
	}

	@Override
	public BigDecimal getSuperficie() {
		return lado.pow(2);
	}

	@Override
	public BigDecimal getBase() {
		return lado;
	}

	@Override
	public BigDecimal getAltura() {
		return lado;
	}
}
