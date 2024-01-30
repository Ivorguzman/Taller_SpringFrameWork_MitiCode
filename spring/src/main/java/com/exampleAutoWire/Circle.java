package com.exampleAutoWire;

// La clase Circle tiene tres puntos como propiedades
public class Circle {


	// Campos privados para los puntos
	private Point point_Q;
	private Point pointB;
	private Point pointC;

	// Métodos de acceso y actualización para los puntos
	public Point getPointA() {
		return this.point_Q;
	}

	public void setPointA(Point pointQ) {
		this.point_Q = pointQ;
	}

	public Point getPointBABO() {
		return this.pointB;
	}

	public void setPointBABO(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return this.pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	// Método que imprime los puntos que forman el círculo
	public void draw() {
		System.out.println("Point A = (" + this.point_Q.getX() + ", " + this.point_Q.getY() + ")");
		System.out.println("Point B = (" + this.pointB.getX() + ", " + this.pointB.getY() + ")");
		System.out.println("Point C = (" + this.pointC.getX() + ", " + this.pointC.getY() + ")");
	}
}
