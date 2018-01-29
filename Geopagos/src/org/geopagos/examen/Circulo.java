package org.geopagos.examen;

import java.math.BigDecimal;

public class Circulo extends FiguraAbstract {

	private static final BigDecimal PII = new BigDecimal(3.1415);
	private static BigDecimal DOS = new BigDecimal(2);
	private BigDecimal radio;

	public Circulo(TipoFigura tipo, BigDecimal radio) {
		super(tipo);
		this.radio = radio;
	}
	
	@Override
	public BigDecimal getSuperficie() {
		return radio.multiply(DOS).multiply(PII);
	}
	
	@Override
	public BigDecimal getDiametro() {
		return DOS.multiply(radio);
	}
}
