package org.geopagos.examen;

import java.math.BigDecimal;

public class Triangulo extends FiguraAbstract {

	private static BigDecimal DOS = new BigDecimal(2);
	private BigDecimal base;
	private BigDecimal altura;

	public Triangulo(TipoFigura tipo, BigDecimal base, BigDecimal altura) {
		super(tipo);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public BigDecimal getBase() {
		return base;
	}

	@Override
	public BigDecimal getAltura() {
		return altura;
	}
	
	@Override
	public BigDecimal getSuperficie() {
		return base.multiply(altura).divide(DOS);
	}

}
