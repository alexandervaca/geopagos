package org.geopagos.examen;

public enum TipoFigura {

	CIRCULO("CIRCULO"),
	CUADRADO("CUADRADO"),
	TRIANGULO("TRIANGULO");
	
	private String descripcion;
	
	private TipoFigura(String descripcion) {
		this.setDescripcion(descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
