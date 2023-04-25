package ejer3;
/**
 * clase que determina los nuevos valores de 'x' y de 'y' 
 * @author Migue
 */
public class Punto {
	int x;
	int y;
	
	/**
	 * Constructor de puntos
	 * @param x Posición 'x' del punto
	 * @param y Posición 'y' del punto
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * altera el valor de 'x' e 'y' directamente
	 * @param x Nueva posición 'x' del punto
	 * @param y Nueva posición 'y' del punto
	 */
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * cambia la posición de 'x' e 'y' mediante suma
	 * También muestra la posición del punto después del incremento
	 * @param de x Posiciones que debe incrementar la 'x'
	 * @param de y Posiciones que debe incrementar la 'y'
	 */
	void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * calcula la distancia entre dos puntos dados
	 * @param Recibe un punto a comparar
	 * @return Devuelve un entero que indica las unidades de distancia entre ambos puntos
	 */
	double distancia(Punto p) {
		double distancia = 0;
		
		distancia = Math.sqrt((Math.pow(this.x - p.x, 2)) + (Math.pow(this.y - p.y, 2)));
		
		return distancia;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
