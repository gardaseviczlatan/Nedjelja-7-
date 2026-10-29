package vjezbe_nedjelja7;

public class Automobil extends VoziloAps {

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm/maxBrzina;
	}

	public Automobil(int id, double maxBrzina) {
		super(id, 80);
	}
	
	
	

}
