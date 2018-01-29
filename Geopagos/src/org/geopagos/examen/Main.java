package org.geopagos.examen;

public class Main {

	public static void main(String[] args) {

		FiguraGeometrica circulo = FiguraFactory.getInstance().build(TipoFigura.CIRCULO);
		System.out.println(circulo + " diametro: " + circulo.getDiametro() + " - superficie: " + circulo.getSuperficie());
		
		FiguraGeometrica cuadrado = FiguraFactory.getInstance().build(TipoFigura.CUADRADO);
		System.out.println(cuadrado + " lado: " + cuadrado.getBase() + " - superficie: " + cuadrado.getSuperficie());
		
		System.out.println("El diametro de un cuadrado es: " + cuadrado.getDiametro());
		
		FiguraGeometrica triangulo = FiguraFactory.getInstance().build(TipoFigura.TRIANGULO);
		System.out.println(triangulo + " base: " + triangulo.getBase() + " altura: " + triangulo.getAltura() + 
				" - superficie: " + triangulo.getSuperficie());
	}

}
