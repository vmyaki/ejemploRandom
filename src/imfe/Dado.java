package imfe;

import java.util.Random;

public class Dado {
	//Atributos
	private int caras;
	private int ultimaTirada;

	//Constructores
	
	/**
	 * Constructor personalizado que me crea un dado con las caras que recibe 
	 * @param caras - Representa el número de caras que tiene el dado. Si el número es 
	 * negativo, se usará el valor absoluto.
	 */
	public Dado(int caras) {
		this.caras = Math.abs(caras);
		this.ultimaTirada = 0;
	}
	/**
	 * Constructor por defecto, que me crea un dado de 6 caras
	 */
	public Dado() {
		this.caras = 6;
		this.ultimaTirada = 0;
	}
	
	//Getters y setters
	public int getCaras() {
		return caras;
	}

	public void setCaras(int caras) {
		this.caras = caras;
	}
	
	public int lanzar() {
		Random aleatorio = new Random();
		int tirada = aleatorio.nextInt(this.caras) + 1;
		this.ultimaTirada = tirada;
		return tirada;
	}
	
	public int getUltimaTirada() {
		return ultimaTirada;
	}

	

}
