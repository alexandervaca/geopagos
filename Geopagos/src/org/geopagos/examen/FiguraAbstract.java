package org.geopagos.examen;

import java.math.BigDecimal;

public abstract class FiguraAbstract implements FiguraGeometrica {

	private TipoFigura tipo;
	
	public FiguraAbstract(TipoFigura tipo) {
		this.tipo = tipo;
	}

	@Override
	public BigDecimal getSuperficie() {
		return null;
	}

	@Override
	public BigDecimal getBase() {
		return null;
	}

	@Override
	public BigDecimal getAltura() {
		return null;
	}

	@Override
	public BigDecimal getDiametro() {
		return null;
	}

	@Override
	public TipoFigura getTipo() {
		return null;
	}

	@Override
	public String toString() {
		return tipo.getDescripcion();
	}
}
