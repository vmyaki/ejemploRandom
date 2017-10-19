package imfe;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos un dado de 6 (por que el constructor por defecto ya me crea directamente un dado de 6)
		Dado dado6 = new Dado();
		
		int veces6=0;
		for (int i=0; i<=4000; i++) {
			
			dado6.lanzar();
			System.out.println("Salió un " + dado6.getUltimaTirada());
			if (dado6.getUltimaTirada() == 6) {
				veces6++;
			}
		}
		
		System.out.println("El 6 salió " + veces6 + " veces");
		
	}

}
