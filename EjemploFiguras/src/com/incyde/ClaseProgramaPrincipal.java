package com.incyde;

public class ClaseProgramaPrincipal {
	
	public static void main(String[] args) {
	    Triangulo trianguloAngela = new Triangulo();
		float[] tempLongitudes = {2,3,5};
		trianguloAngela.longitudes = tempLongitudes; 
		System.out.println("El perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 8f;
		trianguloAngela.color = "Rojo";
		System.out.println(trianguloAngela.toString());
		System.out.println("La area es " + trianguloAngela.area());
		
		Triangulo trianguloKatia = new Triangulo();
		float[] tempLongitudes1 = {2,3,5};
		trianguloKatia.longitudes = tempLongitudes1;
		System.out.println("El Perimetro es " + trianguloKatia.perimetro());
		trianguloKatia.base = 10f;
		trianguloKatia.altura = 12f;
		trianguloKatia.color = "Verde";
		System.out.println(trianguloKatia.toString());
		trianguloKatia.dibujar();
		System.out.println("La area es " + trianguloKatia.area());
	
	   Cuadrado cuadradoSnake = new Cuadrado();
	   System.out.println("El perimetro es " + cuadradoSnake.perimetro());
	   cuadradoSnake.lado = 10f;
	   cuadradoSnake.color = "Negro";
	   System.out.println(cuadradoSnake.toString());
	   System.out.println("La area es " + cuadradoSnake.area());
	   
	   Rectangulo rectanguloKaty = new Rectangulo();
	   System.out.println("El perimetro es " + rectanguloKaty.perimetro());
	   rectanguloKaty.base = 10f;
	   rectanguloKaty.altura = 5f;
	   rectanguloKaty.color = "Azul";
	   System.out.println(rectanguloKaty.toString());
	   System.out.println("La area es " + rectanguloKaty.area());
	}   
}
